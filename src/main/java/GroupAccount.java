import java.time.LocalDate;

public class GroupAccount {
    int groupID;
    int accountID;
    LocalDate joinDate;

    public GroupAccount(int groupID, int accountID, LocalDate joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupID=" + groupID +
                ", accountID=" + accountID +
                ", joinDate=" + joinDate +
                '}';
    }
}
