package com.casandra.example.controller;

import com.casandra.example.entity.User;
import com.casandra.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userRepo.findById(id).orElseThrow();
    }
}
