package com.reactive.service;

import com.reactive.entity.EmployeeEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

	public Flux<EmployeeEntity> getAllEMployee();
	
	public Mono<EmployeeEntity> addNewEmployee(EmployeeEntity entity);
	
	public Mono<Void> deleteEmployee(String id);
	
}
