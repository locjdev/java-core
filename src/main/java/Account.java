import java.time.LocalDate;

public class Account {
     int accountID;
     String email;
     String username;
     String fullname;
     Department department;
     Position position;
     LocalDate createDate;

     public Account(int accountID, String email, String username, String fullname, Department department, Position position, LocalDate createDate) {
          this.accountID = accountID;
          this.email = email;
          this.username = username;
          this.fullname = fullname;
          this.department = department;
          this.position = position;
          this.createDate = createDate;
     }

     @Override
     public String toString() {
          return "Account{" +
                  "accountID=" + accountID +
                  ", email='" + email + '\'' +
                  ", username='" + username + '\'' +
                  ", fullname='" + fullname + '\'' +
                  ", department=" + department +
                  ", position=" + position +
                  ", createDate=" + createDate +
                  '}';
     }
}
