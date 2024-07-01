package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// co the tu dong tao interface bang cach su dung refactory -> extract interface
public interface IUserService {
    List<User> findAll() ;

    int create(String fullname, String email) ;

    User findById(int id) ;

    int deleteById(int id) ;

    User findByEmailAndPassword(String email, String password);
}
