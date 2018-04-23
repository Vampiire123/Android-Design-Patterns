/*
 * Copyright (C) 2018 Sylvia Domenech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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