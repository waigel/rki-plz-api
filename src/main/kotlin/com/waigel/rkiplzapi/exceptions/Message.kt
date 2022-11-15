package com.waigel.rkiplzapi.exceptions

import java.util.Locale

enum class Message {
    RESOURCE_NOT_FOUND;

    val code: String
        get() = name.uppercase(Locale.getDefault())
}
