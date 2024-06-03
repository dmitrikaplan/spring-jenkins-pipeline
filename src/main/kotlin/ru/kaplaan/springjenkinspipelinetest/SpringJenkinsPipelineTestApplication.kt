package ru.kaplaan.springjenkinspipelinetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringJenkinsPipelineTestApplication

fun main(args: Array<String>) {
    runApplication<SpringJenkinsPipelineTestApplication>(*args)
}
