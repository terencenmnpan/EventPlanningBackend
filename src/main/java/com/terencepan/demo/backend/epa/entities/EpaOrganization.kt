package com.terencepan.demo.backend.epa.entities

import org.springframework.data.annotation.Id

class EpaOrganization {
    @Id
    lateinit var organizationId: String
    lateinit var organizationName: String
    lateinit var organizationUsers: List<EpaUser>
    lateinit var mailingAddress: EpaAddress
}