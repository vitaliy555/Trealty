package com.realty

import org.slf4j.LoggerFactory
import java.util.*

const val ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"

fun generateLocationPrefix(): List<String> {
    var generatedPrefix = ArrayList<String>()
    for (letter1 in ALPHABET)
        for (letter2 in ALPHABET)
            generatedPrefix.add("$letter1$letter2")
    return generatedPrefix
}

inline fun <reified T : Any> loggerFor() = LoggerFactory.getLogger(T::class.java)