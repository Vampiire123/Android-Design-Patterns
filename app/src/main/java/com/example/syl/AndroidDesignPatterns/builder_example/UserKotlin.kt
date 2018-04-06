package com.example.syl.AndroidDesignPatterns.builder_example

class UserKotlin {

    var firstname: String
    var age: Int
    var mobile: String

    constructor(firstname: String, age: Int, mobile: String){
        this.firstname = firstname
        this.age = age
        this.mobile = mobile
    }

    override fun toString(): String {
        return "UserKotlin(firstname='$firstname', age=$age, mobile='$mobile')"
    }

    class UserKotlinBuilder {
        private var firstName: String
        private var age: Int = 0
        private var mobile: String = ""

        constructor(firstName: String) {
            this.firstName = firstName
        }

        fun age(age: Int): UserKotlinBuilder {
            this.age = age
            return this
        }

        fun mobile(mobile: String): UserKotlinBuilder {
            this.mobile = mobile
            return this
        }

        fun build(): UserKotlin {
            return UserKotlin(firstName, age, mobile)
        }
    }
}