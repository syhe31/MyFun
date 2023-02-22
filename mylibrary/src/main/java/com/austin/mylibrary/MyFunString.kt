package com.austin.mylibrary

object MyFunString {

    private val _defName = "Austin"

    fun sayHello(name: String): String {
        return if (name.isEmpty()) {
            "Hello $_defName"
        } else {
            "Hello $name"
        }
    }

    private const val rule_number = "^[0-9]$"

    fun isNum(): Boolean {
        return true
    }

}