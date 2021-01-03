package com.terencepan.demo.backend.epa.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class EpaUser(
        @Id
        val userId: String? = null,
        val userName: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val emailAddress: String? = null,
        @CreatedDate
        val createdDate: LocalDateTime? = LocalDateTime.now(),
        @LastModifiedDate
        val modifiedDate: LocalDateTime? = LocalDateTime.now()
)