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

    public List<User> findEmployeeAndMangerByProjectId(int id) {
        return service.findEmployeeAndMangerByProjectId(id);
    }

    public int create(String fullname, String email) {
        return service.create(fullname, email);
    }


    public User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }
}
