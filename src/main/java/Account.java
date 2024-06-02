import java.time.LocalDate;

public class Account {
     int accountID;
     String email;
     String username;
     String fullname;
     int departmentID;
     int positionID;
     LocalDate createDate;

     public Account(int accountID, String email, String username, String fullname, int departmentID, int positionID, LocalDate createDate) {
          this.accountID = accountID;
          this.email = email;
          this.username = username;
          this.fullname = fullname;
          this.departmentID = departmentID;
          this.positionID = positionID;
          this.createDate = createDate;
     }

     @Override
     public String toString() {
          return "Account{" +
                  "accountID=" + accountID +
                  ", email='" + email + '\'' +
                  ", username='" + username + '\'' +
                  ", fullname='" + fullname + '\'' +
                  ", departmentID=" + departmentID +
                  ", positionID=" + positionID +
                  ", createDate=" + createDate +
                  '}';
     }
}
