package br.com.alura.forum.model

data class User (
    val id: Long? = null, //? = opcional
    val user: String,
    val email: String,
)
