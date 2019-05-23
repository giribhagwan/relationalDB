package com.example.relationalDB.controller;

import com.example.relationalDB.config.UpperCase;
import com.example.relationalDB.domain.employee.Task;
import com.example.relationalDB.receipt.ReceiptGeneration;
import com.example.relationalDB.services.TaskDto;
import com.example.relationalDB.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import static com.example.relationalDB.config.Constants.*;


@RestController
@RequestMapping("/api/task")
public class TaskController {


    Map<String, Object> responseMap = new HashMap<>();
    @Autowired
    private TaskService taskService;

    @Autowired
    private ReceiptGeneration receiptGeneration;

    @PostMapping("/saveTask")
    public Callable<ResponseEntity<?>> saveTask(@RequestBody TaskDto taskDto) {
        return () -> {
            Task task = taskService.save(taskDto);
            responseMap.put(STATUS, SUCCESS);
            responseMap.put(TASK_DTO, task);
            return ResponseEntity.ok(responseMap);
        };
    }

    @PostMapping("/updateEmp")
    public Callable<ResponseEntity<?>> updateEmp(TaskDto taskDto) {
        return () -> {
            Task task = taskService.save(taskDto);
            responseMap.put(STATUS, SUCCESS);
            responseMap.put(TASK_DTO, task);
            return ResponseEntity.ok(responseMap);
        };
    }


    @RequestMapping(path = "/download", method = RequestMethod.GET)
    public ResponseEntity<Resource> download(String param) throws IOException {

//        File file=new File("text.txt");
        File file=new File(receiptGeneration.generate("text.pdf"));
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=text.pdf");
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }

    @GetMapping("/test")
    public String test(@UpperCase("foo") String foo){

        return foo;
    }

}
