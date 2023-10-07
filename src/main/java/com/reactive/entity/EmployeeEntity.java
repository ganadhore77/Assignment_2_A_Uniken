package com.reactive.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Document(collection = "employee_details")
public class EmployeeEntity {
	
	@Id
	private String id;
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	private String address;
	
}
