package br.com.alura.forum.model

import java.time.LocalDateTime

data class Topic (
    var id: Long? = null,
    val title: String,
    val message: String,
    val dataTime: LocalDateTime = LocalDateTime.now(),
    val course: Course,
    val user: User,
    val status: TopicStatus = TopicStatus.NOT_RESPONDED,
    val replies: List <Reply> = ArrayList()
)