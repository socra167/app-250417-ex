package com.app250417ex

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class HomeController {
    @GetMapping
    fun welcomeMessage(): String = "Hello World!"
}
