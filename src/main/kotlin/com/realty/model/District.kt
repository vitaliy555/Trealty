package com.realty.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class District(@Id
                    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
                    var id: String,
                    var text: String, var text_simple: String, var text_gray: String, var lon: Double, var lat: Double, var zoom: Int, var url: String)