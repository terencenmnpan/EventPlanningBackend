package com.terencepan.demo.backend.epa.entities

import org.springframework.data.annotation.Id

data class EpaAddress (
    @Id
    var addressId: String? = null,
    var addressName: String? = null,
    var streetAddress: String? = null,
    var stateCode: String? = null,
    var city: String? = null,
    var postalCode: String? = null,
    var primaryFlag: Boolean? = false
)