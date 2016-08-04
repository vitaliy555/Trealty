package com.realty.dto

import com.realty.enum.Status

data class LocationDistrict(var id: String, var text: String, var text_simple: String, var text_gray: String, var lon: Double, var lat: Double, var zoom: Int, var url: String)
data class LocationResponse(var status: Status, var data: List<LocationDistrict>)