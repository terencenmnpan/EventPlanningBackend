package com.terencepan.demo.backend.epa.entities;

import org.springframework.data.annotation.Id;

public class EpaAddress {
    @Id
    private String addressId;
    private String addressName;
    private String streetAddress;
    private String stateCode;
    private String city;
    private String postalCode;
}
