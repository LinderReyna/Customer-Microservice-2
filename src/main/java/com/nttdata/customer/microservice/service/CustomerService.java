package com.nttdata.customer.microservice.service;

import com.nttdata.customer.microservice.model.Customer;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<Customer> save(Mono<Customer> customer);
    Mono<Customer> findById(String id);
    Mono<Customer> findByDocument(String document);
    Mono<Customer> update(Mono<Customer> customer, String id);
    Mono<Void> deleteById(String id);
}
