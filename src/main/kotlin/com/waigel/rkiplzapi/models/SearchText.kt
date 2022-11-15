package com.waigel.rkiplzapi.models

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

class SearchText(
    @JacksonXmlProperty(localName = "Value", isAttribute = true)
    var value: String? = null,
)
