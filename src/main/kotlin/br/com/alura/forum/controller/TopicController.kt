package br.com.alura.forum.controller


import br.com.alura.forum.dto.TopicForm
import br.com.alura.forum.dto.TopicView
import br.com.alura.forum.model.*
import br.com.alura.forum.service.TopicService
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/topics")
class TopicController(val service: TopicService) {

    @GetMapping
    fun list(): List<TopicView> {
        return service.list()
    }

    @GetMapping("/{id}")
    fun searchById(@PathVariable id: Long): TopicView {
        return service.searchById(id)
    }

    @PostMapping
    fun postTopic(@RequestBody @Valid dto: TopicForm) {
        service.postTopic(dto)
    }
}