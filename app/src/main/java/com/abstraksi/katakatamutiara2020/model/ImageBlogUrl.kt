package com.abstraksi.katakatamutiara2020.model

import com.google.gson.annotations.SerializedName

class ImageBlogUrl(
    @SerializedName("alt") var alt: String,
    @SerializedName("url") var url: String
)