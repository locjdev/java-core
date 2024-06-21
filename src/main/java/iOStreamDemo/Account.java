package iOStreamDemo;

import java.io.Serializable;


// Phải implements Serializable mới có thể sử dụng trong File
public class Account implements Serializable {
    private int id;
    private String username;
    // Không lưu dữ liệu password xuống file, chỉ lưu giá trị mặc định, vd String: null, int: 0
    private transient String password;

    public Account(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
