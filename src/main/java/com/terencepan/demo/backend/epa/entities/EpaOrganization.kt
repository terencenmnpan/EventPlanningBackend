package com.terencepan.demo.backend.epa.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class EpaOrganization(
        @Id
        var organizationId: String? = null,
        //@NotNull(message="Organization Name cannot be blank")
        var organizationName: String? = null,
        var organizationUsers: List<EpaUser>? = null,
        var mailingAddress: EpaAddress? = null,
        @CreatedDate
        val createdDate: LocalDateTime? = LocalDateTime.now(),
        @LastModifiedDate
        val modifiedDate: LocalDateTime? = LocalDateTime.now()
)