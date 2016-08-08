package com.realty.facade

import com.realty.dto.LocationDistrict
import com.realty.generateLocationPrefix
import com.realty.service.LocationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class LocationFacade {

    @Autowired
    private lateinit var locationService: LocationService


    fun updateLocations(): List<LocationDistrict> {
        var locationDistricts: MutableList<LocationDistrict> = ArrayList()
        for (prefix in generateLocationPrefix()) {
            var locationResponse = locationService.searchLocations(prefix)
            locationDistricts.addAll(locationResponse.data)
        }
        locationService.updateLocations(locationDistricts)
        return locationDistricts
    }
}