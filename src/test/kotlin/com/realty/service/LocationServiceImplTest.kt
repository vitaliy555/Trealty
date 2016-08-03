package com.realty.service

import com.realty.dto.LocationResponse
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

/**
 * Created by vitaliy on 8/3/16.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class LocationServiceImplTest {
    val LOCATION_PREFIX_VALUE = "дн"
    @Autowired
    lateinit var locationService: LocationService

    @Before
    fun setUp() {

    }

    @Test
    fun searchLocations() {
        var response: LocationResponse = locationService.searchLocations(LOCATION_PREFIX_VALUE)
        assertThat(response.status, Matchers.equalToIgnoringCase("OK"))  //TODO Enum
        assertThat(response.data, Matchers.hasSize(27))
    }


}