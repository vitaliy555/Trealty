package com.realty.converter

import com.realty.dto.LocationDistrict
import com.realty.model.District
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class LocationDistrictConverter : Converter<LocationDistrict, District> {
    override fun convert(locationDistrict: LocationDistrict): District {
        var district = District(
                id = locationDistrict.id,
                lat = locationDistrict.lat,
                lon = locationDistrict.lon,
                text = locationDistrict.text,
                text_gray = locationDistrict.text_gray,
                text_simple = locationDistrict.text_simple,
                url = locationDistrict.url,
                zoom = locationDistrict.zoom
        )
        return district
    }

    fun convert(locationDistricts: List<LocationDistrict>): List<District> {
        return locationDistricts.map { convert(it) }
    }
}