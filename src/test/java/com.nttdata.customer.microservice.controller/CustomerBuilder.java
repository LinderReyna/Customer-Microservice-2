package com.nttdata.customer.microservice.controller;

import com.nttdata.customer.microservice.model.Customer;

import java.util.Collections;
import java.util.List;

public class CustomerBuilder {
    public static List<String> getIds() {
        return Collections.singletonList("636dd894a3da3a2e59d90ad2");
    }

    public static Customer getDto() {
        Customer dto = new Customer();
        dto.setId("636dd894a3da3a2e59d90ad2");
        dto.setEmail("linder_reynae@hotmail.com");
        dto.setPhone("940000000");
        return dto;
    }
}