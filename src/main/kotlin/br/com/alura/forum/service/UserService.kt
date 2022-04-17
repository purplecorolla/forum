package br.com.alura.forum.service

import br.com.alura.forum.model.User
import org.springframework.stereotype.Service

@Service
class UserService (var users: List<User>) {

    init {
        val user = User (
            id = 1,
            user = "Fernando",
            email = "fernando123@gmail.com"
        )
        users = listOf(user)
    }
    fun searchById(id: Long): User {
        return users.stream().filter({
                u -> u.id == id
        }).findFirst().get()
    }
}
