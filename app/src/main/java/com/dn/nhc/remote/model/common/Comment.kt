package com.dn.nhc.remote.model.common

import com.dn.nhc.remote.model.ResponseModel
import com.google.gson.annotations.SerializedName

data class Comment(
    @SerializedName("child_comments") val childComments: List<Comment>?,
    @SerializedName("comment") val comment: String,
    @SerializedName("created_time") val createdTime: String,
    @SerializedName("id") val id: Int,
    @SerializedName("is_deleted") val isDeleted: Boolean,
    @SerializedName("parent_comment_id") val parentCommentId: Int,
    @SerializedName("post_id") val postId: Int,
    @SerializedName("user") val user: User,
    @SerializedName("is_mine") val isMine: Boolean
): ResponseModel()