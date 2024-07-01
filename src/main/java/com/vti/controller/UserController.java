package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

// Tầng cao nhất nên không cần controller
@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findAll() {
        return service.findAll();
    }

    public User findById(int id) {
        return service.findById(id);
    }

    public int create(String fullname, String email) {
        return service.create(fullname, email);
    }

    public int deleteById(int id) {
        return service.deleteById(id);
    }

    public User findByEmailAndPassword(String email, String password) {
        return service.findByEmailAndPassword(email, password);
    }
}
