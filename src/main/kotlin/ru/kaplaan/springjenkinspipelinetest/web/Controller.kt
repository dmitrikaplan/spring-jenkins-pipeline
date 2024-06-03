package ru.kaplaan.springjenkinspipelinetest.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class Controller {


    @GetMapping("/hello/{name}")
    fun hello(@PathVariable name: String): String =
        "Hello, $name!!"
}