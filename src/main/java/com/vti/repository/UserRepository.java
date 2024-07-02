package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findEmployeeAndMangerByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role IN('EMPLOYEE','MANAGER') AND project_id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                // Câu sql kh có ? nên dùng statement
                PreparedStatement stmt = connection.prepareStatement(sql);
        ) {
            stmt.setInt(1, projectId);
            try (ResultSet rs = stmt.executeQuery()) {
                List<User> users = new LinkedList<>();
                while (rs.next()) {
                    User user = getUser(rs);
                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public int create(String fullname, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users(full_name,email) VALUES (?,?)";
        try (
                Connection connection = JdbcUtil.getConnection();
                // Vì câu sql có ? nên xài Prepare...
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setString(1, fullname);
            pStmt.setString(2, email);
            return pStmt.executeUpdate();
        }
    }

    private User getUser(ResultSet rs) throws SQLException, IOException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullname(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        user.setProjectId(rs.getInt("project_id"));
        return user;
    }


    @Override
    public User findAdminByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_admin_by_email_and_password(?,?)}";
        try (
                Connection connection = JdbcUtil.getConnection();
                // vì gọi hàm trong sql nên dùng Callable
                CallableStatement cStmt = connection.prepareCall(sql);
        ) {
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try (ResultSet rs = cStmt.executeQuery()) {
                return rs.next() ? getUser(rs) : null;
            }
        }
    }
}
