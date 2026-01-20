package com.example.user_service;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User create(@RequestBody request req) {
        User user  = new User();
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        return repo.save(user);
    }

    @GetMapping("/{id}")
    public String get(@PathVariable Long id) {
        return "hyy";

    }
}

