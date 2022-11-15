package com.waigel.rkiplzapi.exceptions

class ValidationException : RuntimeException {
    val validationErrors: MutableSet<ValidationError> = LinkedHashSet()

    constructor(message: Message, vararg parameters: String) {
        validationErrors.add(ValidationError(ValidationErrorType.CUSTOM_VALIDATION, message, *parameters))
    }

    constructor(validationErrors: Collection<ValidationError>?) {
        this.validationErrors.addAll(validationErrors!!)
    }
}
