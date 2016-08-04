package com.realty

import org.hamcrest.Matcher
import org.hamcrest.Matchers.hasSize
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
class UtilsKtTest {

    @Test
    fun shouldGenerateLocationPrefix() {
        var generatedPrefix = generateLocationPrefix()
        assertThat(generatedPrefix, hasSize(1089) )
    }

}