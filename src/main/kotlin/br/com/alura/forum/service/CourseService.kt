package br.com.alura.forum.service

import br.com.alura.forum.model.Course
import org.springframework.stereotype.Service

@Service
class CourseService (var courses: List<Course>) {

    init {
        val course = Course (
            id = 1,
            courseName = "Kotlin",
            category = "Programação"
        )
        courses = listOf(course)
    }
    fun searchById(id: Long): Course {
        return courses.stream().filter({
            c -> c.id == id
        }).findFirst().get()
    }
}
