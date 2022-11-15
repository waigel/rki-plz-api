package com.waigel.rkiplzapi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@OpenAPIDefinition(
    info = Info(
        title = "RKI PLZ API",
        version = "1.0",
        description = "The REST API for the RKI PLZ corona management system.",
        contact = Contact(url = "https://testperfect.de", name = "Novax Digital GmbH", email = "info@testperfect.de")
    )
)
@EnableAsync
@SpringBootApplication
@EntityScan
@EnableConfigurationProperties
@ConfigurationPropertiesScan
class RkiPlzApiApplication

fun main(args: Array<String>) {
    runApplication<RkiPlzApiApplication>(*args)
}
