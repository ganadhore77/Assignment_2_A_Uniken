package com.reactive.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;

import com.reactive.entity.EmployeeEntity;

import reactor.core.publisher.Mono;

public interface EmployeeRepository extends ReactiveMongoRepository<EmployeeEntity, String> {

}
