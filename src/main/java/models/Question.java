package models;

import java.time.LocalDate;

public class Question {
    int questionID;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    LocalDate createDate;

    public Question(int questionID, String content, CategoryQuestion category, TypeQuestion type, Account creator, LocalDate createDate) {
        this.questionID = questionID;
        this.content = content;
        this.category = category;
        this.type = type;
        this.creator = creator;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "models.Question{" +
                "questionID=" + questionID +
                ", content='" + content + '\'' +
                ", category=" + category +
                ", type=" + type +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
