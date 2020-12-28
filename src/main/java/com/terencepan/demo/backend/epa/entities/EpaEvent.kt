package com.terencepan.demo.backend.epa.entities;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class EpaEvent {
    @Id
    private String eventId;
    private String organizationId;
    private String organizerId;
    private EpaAddress eventAddress;
    private LocalDateTime eventStartTime;
    private LocalDateTime eventEndTime;
}
