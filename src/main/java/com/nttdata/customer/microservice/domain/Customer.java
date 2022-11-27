package com.nttdata.customer.microservice.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;

@Data
@Document
public class Customer {
    @Id
    private String id;
    private String type;
    @Indexed(unique = true)
    private String document;
    private String name;
    private String email;
    private String phone;
    @CreatedDate
    private OffsetDateTime createdAt;
}
