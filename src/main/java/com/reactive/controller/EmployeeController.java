package com.reactive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.entity.EmployeeEntity;
import com.reactive.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmp")
	public ResponseEntity<Mono<EmployeeEntity>> addEmployee(@RequestBody EmployeeEntity entity) {
		try {
			Mono<EmployeeEntity> addNewEmployee = service.addNewEmployee(entity);
			return new ResponseEntity<Mono<EmployeeEntity>>(addNewEmployee, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<Flux<EmployeeEntity>> getAllEmployee(){
		try {
			Flux<EmployeeEntity> allEMployee = service.getAllEMployee();
			System.out.println(allEMployee);
			return new ResponseEntity<Flux<EmployeeEntity>>(allEMployee, HttpStatus.OK);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<Mono<Void>> deleteEmployee(@PathVariable String id){
		service.deleteEmployee(id);
		return new ResponseEntity<Mono<Void>>( HttpStatus.OK);
	}
	
	@PutMapping("/updateEmp")
	public ResponseEntity<Mono<EmployeeEntity>> updateEmp(@RequestBody EmployeeEntity entity) {
		try {
			Mono<EmployeeEntity> addNewEmployee = service.addNewEmployee(entity);
			return new ResponseEntity<Mono<EmployeeEntity>>(addNewEmployee, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
