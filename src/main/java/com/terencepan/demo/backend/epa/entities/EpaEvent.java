package com.terencepan.demo.backend.epa.entities;

import java.time.LocalDateTime;

public class EpaEvent {

    private EpaOrganization organizationOwner;
    private EpaUser organizer;
    private EpaAddress eventAddress;
    private LocalDateTime eventStartTime;
    private LocalDateTime eventEndTime;
}
