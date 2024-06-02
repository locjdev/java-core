import java.time.LocalDate;

public class Question {
    int questionID;
    String content;
    int categoryID;
    int typeID;
    int creatorID;
    LocalDate createDate;

    public Question(int questionID, String content, int categoryID, int typeID, int creatorID, LocalDate createDate) {
        this.questionID = questionID;
        this.content = content;
        this.categoryID = categoryID;
        this.typeID = typeID;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionID=" + questionID +
                ", content='" + content + '\'' +
                ", categoryID=" + categoryID +
                ", typeID=" + typeID +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
