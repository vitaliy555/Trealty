package com.realty.dto

import org.springframework.util.LinkedMultiValueMap


data class LocationDistrict(var id: String, var text: String, var text_simple: String, var text_gray: String, var lon: Double, var lat: Double, var zoom: Int, var url: String)
data class LocationResponse(var status: String, var data: List<LocationDistrict>)