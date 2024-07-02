package com.vti.service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

// tao contructor
@AllArgsConstructor
public class UserService implements IUserService {
    private IUserRepository repository;

    @Override
    public List<User> findEmployeeAndMangerByProjectId(int projectId) {
        try {
            return repository.findEmployeeAndMangerByProjectId(projectId);
        } catch (SQLException | IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public int create(String fullname, String email) {
        try {
            return repository.create(fullname, email);
        } catch (SQLException | IOException e) {
            return 0;
        }

    }

    @Override
    public User findAdminByEmailAndPassword(String email, String password) {
        try {
            return repository.findAdminByEmailAndPassword(email, password);
        } catch (SQLException | IOException e) {
            return null;
        }
    }
}
