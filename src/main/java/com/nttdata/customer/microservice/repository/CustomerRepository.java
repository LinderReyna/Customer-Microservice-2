package com.nttdata.customer.microservice.repository;

import com.nttdata.customer.microservice.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
    Mono<Customer> findFirstByPersonal_DocumentNumberOrBusiness_Ruc(Mono<String> personal_documentNumber, Mono<String> business_ruc);
    Mono<Customer> findFirstByPhone(String phone);
}