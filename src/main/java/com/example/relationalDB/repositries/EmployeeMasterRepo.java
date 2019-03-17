package com.example.relationalDB.repositries;

import com.example.relationalDB.domain.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster, Long> {
//    @Query("select emp from EmployeeMaster emp")
    EmployeeMaster findByEmpId(Long empId);
}
