package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// co the tu dong tao interface bang cach su dung refactory -> extract interface
public interface IUserService {
    List<User> findEmployeeAndMangerByProjectId(int projectId);

    int create(String fullname, String email);

    User findAdminByEmailAndPassword(String email, String password);
}
