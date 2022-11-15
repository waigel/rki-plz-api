package com.waigel.rkiplzapi.exceptions

import java.io.Serializable

class ErrorResponseBody(

    var code: String,
    var params: List<Serializable>?
)
