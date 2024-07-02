package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private Role role;
    private String proSkill;
    private int expInYear;
    private int projectId;

    public enum Role {
        MANAGER, EMPLOYEE
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role);
    }
}
