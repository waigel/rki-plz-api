package com.waigel.rkiplzapi.models

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class TransmittingSite(

    @JacksonXmlProperty(localName = "SearchText")
    @JacksonXmlElementWrapper(useWrapping = false)
    val searchText: List<SearchText>,

    @JacksonXmlProperty(localName = "Name", isAttribute = true)
    val name: String,

    @JacksonXmlProperty(localName = "Code", isAttribute = true)
    val code: String,

    @JacksonXmlProperty(localName = "Department", isAttribute = true)
    val department: String,

    @JacksonXmlProperty(localName = "Street", isAttribute = true)
    val street: String,

    @JacksonXmlProperty(localName = "Postalcode", isAttribute = true)
    val postalCode: String,

    @JacksonXmlProperty(localName = "Place", isAttribute = true)
    val place: String,

    @JacksonXmlProperty(localName = "Phone", isAttribute = true)
    val phone: String,

    @JacksonXmlProperty(localName = "Fax", isAttribute = true)
    val fax: String,

    @JacksonXmlProperty(localName = "Email", isAttribute = true)
    val email: String,

    @JacksonXmlProperty(localName = "Covid19Hotline", isAttribute = true)
    val covid19Hotline: String,

    @JacksonXmlProperty(localName = "Covid19EMail", isAttribute = true)
    val covid19Email: String,

    @JacksonXmlProperty(localName = "Covid19Fax", isAttribute = true)
    val covid19Fax: String,

    @JacksonXmlProperty(localName = "EinreiseAnmeldungHotline", isAttribute = true)
    val einreiseAnmeldungHotline: String,

    @JacksonXmlProperty(localName = "EinreiseAnmeldungEMail", isAttribute = true)
    val einreiseAnmeldungEmail: String,

    @JacksonXmlProperty(localName = "EinreiseAnmeldungFax", isAttribute = true)
    val einreiseAnmeldungFax: String,

)
