package com.realty

import com.realty.parser.LocationParser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created by vitaliy on 8/2/16.
 */
@RestController
open class ParseController {
    @Autowired

    lateinit var locationParser: LocationParser

    @RequestMapping("/parse")
    open fun parse():String{
        return locationParser.parse()//"OK"
    }
}