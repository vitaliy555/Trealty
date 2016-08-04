package com.realty.enum

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

@JsonDeserialize(using = StatusDeserializer::class)
enum class Status {
    OK,
    ERROR
}


class StatusDeserializer : StdDeserializer<Status>(Status::class.java) {
    override fun deserialize(p0: JsonParser?, p1: DeserializationContext?): Status {
        return Status.valueOf(p0!!.getText().toUpperCase())
    }
}