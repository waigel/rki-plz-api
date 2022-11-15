package com.waigel.rkiplzapi.service

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.waigel.rkiplzapi.configurations.ImportConfiguration
import com.waigel.rkiplzapi.models.TransmittingSite
import com.waigel.rkiplzapi.models.TransmittingSites
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

@Service
class DataService(
    private val configuration: ImportConfiguration
) {

    private val logger = LoggerFactory.getLogger(DataService::class.java)
    private val storage = mutableListOf<TransmittingSites>()

    private fun getImportPath(): String {
        return configuration.path ?: throw RuntimeException("Import path not configured")
    }

    @Bean(name = ["importFile"])
    private fun readImportFile() {
        val path = getImportPath()
        logger.info("Reading import file from $path")
        try {
            val xmlMapper = XmlMapper()
            val content = String(Files.readAllBytes(Paths.get(path)), Charsets.UTF_16)
            this.storage.add(xmlMapper.readValue(content, TransmittingSites::class.java))
        } catch (e: IOException) {
            logger.error("Could not read file from path: $path", e)
            throw RuntimeException("Could not read file from path: $path", e)
        }
    }

    fun searchByZipCode(zipCode: String): List<TransmittingSite> {
        logger.debug("Searching for zip code $zipCode")
        return storage.flatMap { it.transmittingSites }.flatMap { tr ->
            tr.searchText.filter { it.value == zipCode }.map { tr }
        }
    }
}
