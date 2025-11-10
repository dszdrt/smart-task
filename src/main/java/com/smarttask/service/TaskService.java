package com.smarttask.service;

import com.smarttask.model.Task;
import com.smarttask.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task createTask(Task task) {
            if (task.getUser() != null && task.getUser().getId() != null) {
                User user = userRepository.findById(task.getUser().getId())
                        .orElseThrow(() -> new RuntimeException("User not found"));
                task.setUser(user);
            }

        return repository.save(task);
    }
}
