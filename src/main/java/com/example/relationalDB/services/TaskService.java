package com.example.relationalDB.services;

import com.example.relationalDB.domain.Task;

public interface TaskService {

    Task save(TaskDto taskDto);
}
