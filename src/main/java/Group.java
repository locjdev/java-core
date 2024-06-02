import java.time.LocalDate;

public class Group {
    int groupID;
    String groupName;
    int creatorID;
    LocalDate createDate;

    public Group(int groupID, String groupName, int creatorID, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
