package com.terencepan.demo.backend.epa.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class EpaEvent (
    @Id
    var eventId: String? = null,
    var organizationId: String? = null,
    var organizerId: String? = null,
    var eventAddress: EpaAddress? = null,
    var eventStartTime: LocalDateTime? = null,
    var eventEndTime: LocalDateTime? = null,
    @CreatedDate
    val createdDate: LocalDateTime? = LocalDateTime.now(),
    @LastModifiedDate
    val modifiedDate: LocalDateTime? = LocalDateTime.now()
)