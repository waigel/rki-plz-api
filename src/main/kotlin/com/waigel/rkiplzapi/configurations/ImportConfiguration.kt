package com.waigel.rkiplzapi.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "api.import")
@ConstructorBinding
class ImportConfiguration {
    var path: String? = null
}
