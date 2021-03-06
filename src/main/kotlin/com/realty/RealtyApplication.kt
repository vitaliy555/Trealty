package com.realty

import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@ComponentScan("com.realty")
open class RealtyApplication {
    @Bean
    open fun restTemplateBean(): RestTemplate = RestTemplate()

    /**
     * This bean allow use date classes without default constructor for Hibernate,Jackson etc
     */
    @Bean
    open fun objectMapperBuilder(): Jackson2ObjectMapperBuilder
            = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule())

}

fun main(args: Array<String>) {
    SpringApplication.run(RealtyApplication::class.java, *args)
}