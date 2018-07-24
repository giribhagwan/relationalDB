package com.example.relationalDB.repositries;

import com.example.relationalDB.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
