package com.terencepan.demo.backend.epa.entities;

import org.springframework.data.annotation.Id;

public class EpaUser {
    @Id
    private String userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
