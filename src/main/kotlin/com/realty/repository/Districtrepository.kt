package com.realty.repository

import com.realty.model.District
import org.springframework.data.repository.CrudRepository

interface DistrictRepository : CrudRepository<District, String> {
}