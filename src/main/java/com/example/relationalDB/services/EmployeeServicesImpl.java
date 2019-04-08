package com.example.relationalDB.services;

import com.example.relationalDB.domain.EmployeeMaster;
import com.example.relationalDB.repositries.EmployeeMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

    @Autowired
    EmployeeMasterRepo employeeMasterRepo;

    @Override
    public EmployeeMaster save(EmployeeDto employeeDto) {
        EmployeeMaster employeeMaster=new EmployeeMaster();
        employeeMaster.setEmpName(employeeDto.getEmpName());
        employeeMaster.setEmpDesignation(employeeDto.getEmpDesignation());
        employeeMaster.setEmpDepartment(employeeDto.getEmpDepartment());
        employeeMaster.setEmpId(employeeDto.getEmpId());
        return employeeMasterRepo.save(employeeMaster);
    }
}
