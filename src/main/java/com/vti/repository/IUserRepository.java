package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// co the tu dong tao interface bang cach su dung refactory -> extract interface
public interface IUserRepository {

    /**
     * @return Trả về tất cả user trong database
     * @throws SQLException Nếu xảy ra lỗi về SQL
     * @throws IOException  Nếu xảy ra lỗi cấu hình
     */
    List<User> findAll() throws SQLException, IOException;

    int create(String fullname, String email) throws SQLException, IOException;

    User findById(int id) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;
}
