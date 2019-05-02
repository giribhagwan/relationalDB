package com.example.relationalDB.repositries.employee;

import com.example.relationalDB.domain.employee.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
