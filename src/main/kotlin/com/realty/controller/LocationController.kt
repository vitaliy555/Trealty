package com.realty.controller

import com.realty.dto.LocationDistrict
import com.realty.facade.LocationFacade
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("location")
open class LocationController {
    @Autowired
    private lateinit var locationFacade: LocationFacade

    @RequestMapping("/all")
    open fun updateLocations(): List<LocationDistrict> {
        return locationFacade.updateLocations()
    }
}