package com.example.demo1.response

class ErrorResponse {
    var status: String? = "error"
    var message: String? = null
    var code: Int? = null

    constructor(message: String, code: Int? = null) {
        this.message = message
        this.code = code
    }
}
