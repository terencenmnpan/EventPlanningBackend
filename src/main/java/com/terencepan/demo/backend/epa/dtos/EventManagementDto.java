package com.terencepan.demo.backend.epa.dtos;

import com.terencepan.demo.backend.epa.entities.EpaAddress;

import java.time.LocalDateTime;

public class EventManagementDto {
    private String userName;
    private String organizationId;
    private String organizerId;
    private LocalDateTime eventStartTime;
    private LocalDateTime eventEndTime;
    private String addressName;
    private String streetAddress;
    private String stateCode;
    private String city;
    private String postalCode;
}
