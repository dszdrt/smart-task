package com.smarttask.controller;

import com.smarttask.model.User;
import com.smarttask.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }
}
