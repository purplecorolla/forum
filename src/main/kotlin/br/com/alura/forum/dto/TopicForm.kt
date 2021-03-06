package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class TopicForm ( //@field = para o campo no metodo post
    @field: NotEmpty
    @field: Size(min = 5, max = 30)
    val title: String,
    @field: NotEmpty
    val message: String,
    @field: NotNull
    val idCourse: Long,
    @field: NotNull
    val idUser: Long
)