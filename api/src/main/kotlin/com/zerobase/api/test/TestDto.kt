package com.zerobase.com.zerobase.api.test

class TestDto {
    data class UserInfoDto(
        val userKey: String,
        val userRegistration: String,
        val userName: String,
        val userIncomeAmount: Long
    )
}