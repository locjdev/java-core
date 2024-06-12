package exercise01;

import java.util.Date;

public class Group {
    protected String groupName;
    protected Account creator;
    protected Account[] accounts;
    protected Date createDate;

    // Constructor không có parameters
    public Group() {
    }

    // Constructor có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String groupName, Account creator, Account[] accounts, Date createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // Constructor có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    public Group(String groupName, Account creator, String[] usernames, Date createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            this.accounts[i] = new Account(usernames[i]);
        }
        this.createDate = createDate;
    }
}


