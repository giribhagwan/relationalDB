package com.example.relationalDB.controller;

import com.example.relationalDB.services.EmployeeDto;
import com.example.relationalDB.services.EmployeeServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.example.relationalDB.config.Constants.STATUS;
import static com.example.relationalDB.config.Constants.SUCCESS;
import static com.example.relationalDB.config.Constants.TASK_DTO;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EmployeeServices employeeServices;

	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmp(@RequestBody EmployeeDto employeeDto) {
		Map<String, Object> responseMap = new HashMap<>();
		logger.info(employeeDto.toString());
		responseMap.put(STATUS, SUCCESS);
		responseMap.put(TASK_DTO, employeeServices.save(employeeDto));
		return ResponseEntity.ok(responseMap);
	}
}
