package com.realty

import java.util.*

const val ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"

fun generateLocationPrefix(): List<String> {
    var generatedPrefix = ArrayList<String>()
    for (letter1 in ALPHABET)
        for (letter2 in ALPHABET)
            generatedPrefix.add("$letter1$letter2")
    return generatedPrefix
}