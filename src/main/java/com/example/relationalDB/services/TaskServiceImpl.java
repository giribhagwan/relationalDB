package com.example.relationalDB.services;

import com.example.relationalDB.domain.Task;
import com.example.relationalDB.repositries.EmployeeMasterRepo;
import com.example.relationalDB.repositries.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepo taskRepo;
    @Autowired
    private EmployeeMasterRepo employeeMasterRepo;

    @Override
    public Task save(TaskDto taskDto) {
        Task task = new Task();
        task.setEmployeeMaster(employeeMasterRepo.findByEmpId(taskDto.getEmpId()));
        task.setTaskTitle(taskDto.getTaskTitle());
        task.setTaskDetail(taskDto.getTaskDetail());
        Task result = taskRepo.save(task);
        return result;
    }
}
