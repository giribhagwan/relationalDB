package com.example.relationalDB.controller;

import com.example.relationalDB.domain.Task;
import com.example.relationalDB.services.EmployeeDto;
import com.example.relationalDB.services.EmployeeServices;
import com.example.relationalDB.services.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import static com.example.relationalDB.config.Constants.STATUS;
import static com.example.relationalDB.config.Constants.SUCCESS;
import static com.example.relationalDB.config.Constants.TASK_DTO;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

    Map<String, Object> responseMap = new HashMap<>();
    @PostMapping("/updateEmployee")
    public Callable<ResponseEntity<?>> updateEmp(EmployeeDto employeeDto) {
        return () -> {
            responseMap.clear();
            responseMap.put(STATUS, SUCCESS);
            responseMap.put(TASK_DTO, employeeServices.save(employeeDto));
            return ResponseEntity.ok(responseMap);
        };
    }
}
