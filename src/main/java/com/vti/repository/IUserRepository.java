package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findEmployeeAndMangerByProjectId(int projectId) throws SQLException, IOException;

    int create(String fullname, String email) throws SQLException, IOException;

    User findAdminByEmailAndPassword(String email, String password) throws SQLException, IOException;
}
