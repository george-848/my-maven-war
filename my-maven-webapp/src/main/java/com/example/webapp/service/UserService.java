package com.example.webapp.service;

import com.example.webapp.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<Long, User> userDatabase = new HashMap<>();
    private long currentId = 1;

    public User createUser(User user) {
        user.setId(currentId++);
        userDatabase.put(user.getId(), user);
        return user;
    }

    public User getUserById(Long id) {
        return userDatabase.get(id);
    }

    // Additional methods for user management can be added here
}