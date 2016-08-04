package com.realty.service

import com.realty.dto.LocationResponse
import com.realty.enum.Status
import org.hamcrest.Matchers.*
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by vitaliy on 8/3/16.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class LocationServiceImplTest {
    private val LOCATION_PREFIX_VALUE = "дн"
    private val LOCATION_PREFIX_BAD_VALUE = "*"

    @Autowired
    lateinit var locationService: LocationService

    @Test
    fun searchLocations() {
        var response: LocationResponse = locationService.searchLocations(LOCATION_PREFIX_VALUE)
        assertThat(response.status, equalTo(Status.OK))
        assertThat(response.data, hasSize(27))
    }

    @Test
    fun shouldReturnErrorAfterSearchLocations() {
        var response: LocationResponse = locationService.searchLocations(LOCATION_PREFIX_BAD_VALUE)
        assertThat(response.status, equalTo(Status.ERROR))
        assertThat(response.data, empty())
    }
}