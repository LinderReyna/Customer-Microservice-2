package com.nttdata.customer.microservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Business {
    private String legalName;
    private String fullName;
    private String ruc;
    private String profile;
}
