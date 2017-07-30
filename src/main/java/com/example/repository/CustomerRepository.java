package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Customer;
@Repository
public interface CustomerRepository  extends MongoRepository<Customer, String>{

}
