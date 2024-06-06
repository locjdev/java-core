package models;

import java.time.LocalDate;

public class GroupAccount {
    Group group;
    Account account;
    LocalDate joinDate;

    public GroupAccount(Group group, Account account, LocalDate joinDate) {
        this.group = group;
        this.account = account;
        this.joinDate = joinDate;
    }

    public Group getGroup() {
        return group;
    }

    public Account getAccount() {
        return account;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "models.GroupAccount{" +
                "group=" + group +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }
}
