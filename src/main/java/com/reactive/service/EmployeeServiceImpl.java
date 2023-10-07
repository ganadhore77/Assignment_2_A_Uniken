package com.reactive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactive.entity.EmployeeEntity;
import com.reactive.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Flux<EmployeeEntity> getAllEMployee() {
		Flux<EmployeeEntity> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Mono<EmployeeEntity> addNewEmployee(EmployeeEntity entity) {
		Mono<EmployeeEntity> save = employeeRepository.save(entity);
		return save;
	}

	@Override
	public Mono<Void> deleteEmployee(String id) {
		return employeeRepository.deleteById(id);
	}

	

}