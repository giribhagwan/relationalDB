package com.example.relationalDB.controller;

import com.example.relationalDB.domain.Task;
import com.example.relationalDB.services.TaskDto;
import com.example.relationalDB.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import static com.example.relationalDB.config.Constants.*;


@RestController
public class TaskController {

    Map<String, Object> responseMap = new HashMap<>();
    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Callable<ResponseEntity<?>> saveTask(TaskDto taskDto) {
        return () -> {
            Task task = taskService.save(taskDto);
            responseMap.put(STATUS, SUCCESS);
            responseMap.put(TASK_DTO, task);
            return ResponseEntity.ok(responseMap);
        };
    }
}
