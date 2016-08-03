package com.realty.parser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 * Created by vitaliy on 8/3/16.
 */
@Component
class HTMLParser {

    @Autowired
    lateinit var rest: RestTemplate

    fun getLocations(resourceUrl : String): Map<String, Any> {

        var fullHtmlDom: String = rest.getForObject(resourceUrl,String::class.java)

        var document: Document = Jsoup.parse(fullHtmlDom)
        return mapOf("test" to "Any")
    }
}