package models;

import java.time.LocalDate;

public class Group {
    int groupID;
    String groupName;
    Account creator;
    LocalDate createDate;

    public Group(int groupID, String groupName, Account creator, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
    }

    public int getGroupID() {
        return groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public Account getCreatorID() {
        return creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "models.Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
