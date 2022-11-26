package com.nttdata.customer.microservice.mapper;

import com.nttdata.customer.microservice.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper{
    com.nttdata.customer.microservice.model.Customer toModel(Customer customer);
    Customer toDocument(com.nttdata.customer.microservice.model.Customer customer);
}