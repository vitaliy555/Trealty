package com.realty.service

import com.realty.URL_LOCATION
import com.realty.converter.LocationDistrictConverter
import com.realty.dto.LocationDistrict
import com.realty.dto.LocationResponse
import com.realty.loggerFor
import com.realty.repository.DistrictRepository
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
    fun updateLocations(locationDistricts: List<LocationDistrict>)
}

@Component
class LocationServiceImpl : LocationService {
    companion object {
        private val LOG = loggerFor<LocationService>()
    }

    @Autowired
    lateinit private var restTemplate: RestTemplate
    @Autowired
    lateinit private var locationDistrictConverter: LocationDistrictConverter
    @Autowired
    private lateinit var districtrepository: DistrictRepository

    override fun searchLocations(locationPrefix: String): LocationResponse {
        var request = createFormDataRequest(locationPrefix)
        LOG.debug(request.toString())
        var response: LocationResponse = restTemplate.postForObject(URL_LOCATION, request, LocationResponse::class.java)
        LOG.debug(response.toString())
        return response
    }

    private fun createFormDataRequest(locationPrefix: String): MultiValueMap<String, String> {
        var formData = LinkedMultiValueMap<String, String>()
        formData.add("data", locationPrefix)
        return formData
    }

    override fun updateLocations(locationDistricts: List<LocationDistrict>) {
        districtrepository.save(locationDistrictConverter.convert(locationDistricts))
    }

}