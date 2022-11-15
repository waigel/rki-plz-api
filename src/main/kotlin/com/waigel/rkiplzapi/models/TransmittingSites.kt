package com.waigel.rkiplzapi.models

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "TransmittingSites")
data class TransmittingSites(
    @JacksonXmlProperty(localName = "TransmittingSite")
    @JacksonXmlElementWrapper(useWrapping = false)
    val transmittingSites: List<TransmittingSite>
)
