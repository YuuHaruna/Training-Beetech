package com.example.common.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RefreshTokenRequest(
    @SerializedName("refreshToken")
    val refreshToken: String
)