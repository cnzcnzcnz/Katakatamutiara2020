package com.abstraksi.katakatamutiara2020.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Blog (
    @SerializedName("kind")
    var kind: String? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("blog")
    var blog: Id? = null,
    @SerializedName("published")
    var published: String? = null,
    @SerializedName("updated")
    var updated: String? = null,
    @SerializedName("url")
    var url: String? = null,
    @SerializedName("selflink")
    var selflink: String? = null,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("content")
    var content: String? = null,
    @SerializedName("author")
    var author: Author? = null
//    val replies: RepliesPost ? = null
)