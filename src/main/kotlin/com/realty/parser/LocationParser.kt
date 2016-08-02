package com.realty.parser

import org.jsoup.Jsoup
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 * Created by vitaliy on 8/2/16.
 */
@Component
class LocationParser {//htmlPARSER TODO
    val olxDomain = "http://olx.ua"

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun parse(): String {
        var html = restTemplate.getForObject(olxDomain, String::class.java)
        return Jsoup.parse(html).title()

    }
}