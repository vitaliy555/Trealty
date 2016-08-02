package com.realty

import com.realty.parser.LocationParser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@ComponentScan("com.realty")
open class RealtyApplication{
    @Bean
    open fun restTemplateBean():RestTemplate= RestTemplate()
}

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