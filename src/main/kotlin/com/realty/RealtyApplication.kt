package com.realty

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class RealtyApplication

fun main(args: Array<String>) {
    SpringApplication.run(RealtyApplication::class.java, *args)
}

@RestController
open class HelloController {
    @RequestMapping("/hello")
    open fun sayHello(): String {
        return "Hi !!!"
    }
}