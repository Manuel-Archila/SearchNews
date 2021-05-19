package com.uvg.searchnews

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("status") val status:String,
    @SerializedName("totalResults") val totalResults:String,
)