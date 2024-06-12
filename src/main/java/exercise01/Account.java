package exercise01;

import java.util.Date;

public class Account {
   protected int id;
   protected String email;
   protected String username;
   protected String firstName;
   protected String lastName;
   protected String fullName;
   protected String position;
   protected Date createDate;

    // Constructor không có parameters
    public Account() {
    }

    public Account(String username) {
        this.username = username;
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName
    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, default createDate = now
    public Account(int id, String email, String username, String firstName, String lastName, String position) {
        this(id, email, username, firstName, lastName);
        this.position = position;
        this.createDate = new Date();
    }

    // Constructor có các parameter là id, Email, Username, FirstName, LastName và Position của User, createDate
    public Account(int id, String email, String username, String firstName, String lastName, String position, Date createDate) {
        this(id, email, username, firstName, lastName, position);
        this.createDate = createDate;
    }
}

// Khởi tạo 1 Object với mỗi constructor

