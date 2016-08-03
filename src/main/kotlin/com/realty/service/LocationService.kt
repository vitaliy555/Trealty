package com.realty.service

import com.realty.URL_LOCATION
import com.realty.dto.LocationResponse
import com.sun.webkit.network.URLs
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.web.client.RestTemplate

/**
 * Created by vitaliy on 8/3/16.
 */

interface LocationService {
    fun searchLocations(locationPrefix: String): LocationResponse
}

@Component
class LocationServiceImpl : LocationService {
    @Autowired
    lateinit var restTemplate: RestTemplate

    override fun searchLocations(locationPrefix: String): LocationResponse {
        var request = createFormDataRequest(locationPrefix)
        var responce: LocationResponse = restTemplate.postForObject(URL_LOCATION, request, LocationResponse::class.java)
        return responce

    }

    fun createFormDataRequest(locationPrefix: String): MultiValueMap<String, String> {
        var formData = LinkedMultiValueMap<String, String>()
        formData.add("data", locationPrefix)
        return formData
    }

}