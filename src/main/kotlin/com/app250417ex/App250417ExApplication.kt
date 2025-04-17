package com.app250417ex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class App250417ExApplication

fun main(args: Array<String>) {
    runApplication<App250417ExApplication>(*args)
}
