package com.realty.parser

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringRunner::class)
@SpringBootTest
class HTMLParserTest {
//    @InjectMocks
    @Autowired
    lateinit var htmlParser: HTMLParser
//    @Mock
//    lateinit var rest: RestTemplate

    @Before
    fun setUp() {

    }

    @Test
    fun getLocations() {
htmlParser.getLocations("http://olx.ua")
    }

}