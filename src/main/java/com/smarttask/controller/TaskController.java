package com.smarttask.controller;

import com.smarttask.model.Task;
import com.smarttask.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAll() {
        return service.getAllTasks();
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.createTask(task);
    }
}
