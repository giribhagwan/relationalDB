package com.example.relationalDB.repositries.employee;

import com.example.relationalDB.domain.employee.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster, Long> {
//    @Query("select emp from EmployeeMaster emp")
    EmployeeMaster findByEmpId(String empId);
}
