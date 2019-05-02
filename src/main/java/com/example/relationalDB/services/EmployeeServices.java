package com.example.relationalDB.services;

import com.example.relationalDB.domain.employee.EmployeeMaster;

public interface EmployeeServices {
    EmployeeMaster save(EmployeeDto employeeDto);
}
