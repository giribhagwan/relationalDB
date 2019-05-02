package com.example.relationalDB.services;

import com.example.relationalDB.domain.employee.Task;

public interface TaskService {

    Task save(TaskDto taskDto);
}
