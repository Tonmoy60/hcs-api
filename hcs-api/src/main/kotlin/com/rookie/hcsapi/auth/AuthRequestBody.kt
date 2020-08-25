package com.rookie.hcsapi.auth

import java.io.Serializable

class AuthRequestBody : Serializable {
    var username: String? = null
    var password: String? = null

    constructor() {}
    constructor(username: String?, password: String?) {
        this.username = username
        this.password = password
    }

    override fun toString(): String {
        return "AuthRequestBody{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'
    }

}