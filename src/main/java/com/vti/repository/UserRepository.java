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
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try (
                Connection connection = JdbcUtil.getConnection();
                // Câu sql kh có ? nên dùng statement
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = getUser(rs);
                users.add(user);
            }
            return users;
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
        return user;
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);

        ) {
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                return rs.next() ? getUser(rs) : null;
            }
        }
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setInt(1, id);
            return pStmt.executeUpdate();
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?,?)}";
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
