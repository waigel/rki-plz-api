package com.waigel.rkiplzapi.controllers

import com.waigel.rkiplzapi.models.TransmittingSite
import com.waigel.rkiplzapi.service.DataService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/authority")
@Tag(name = "Authority", description = "Search for authorities by zip code")
class AuthorityController(
    private val dataService: DataService
) {

    private val logger = LoggerFactory.getLogger(AuthorityController::class.java)

    @GetMapping("", produces = ["application/json"])
    @Operation(summary = "Search for authorities by zip code")
    fun searchByZipCode(
        @RequestParam(value = "plz", required = true) plz: String
    ): ResponseEntity<List<TransmittingSite>> {
        logger.info("Searching for authorities by zip code: $plz")
        return ResponseEntity.status(200).body(dataService.searchByZipCode(plz))
    }
}
