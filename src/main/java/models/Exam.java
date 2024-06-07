package models;

import java.time.LocalDate;

public class Exam {
    int examID;
    String code;
    String tille;
    CategoryQuestion category;
    int duration;
    Account creator;
    LocalDate createDate;

    public Exam(int examID, String code, String tille, CategoryQuestion category, int duration, Account creator, LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.tille = tille;
        this.category = category;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }

    public int getExamID() {
        return examID;
    }

    public String getCode() {
        return code;
    }

    public String getTille() {
        return tille;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public int getDuration() {
        return duration;
    }

    public Account getCreator() {
        return creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "models.Exam{" +
                "examID=" + examID +
                ", code='" + code + '\'' +
                ", tille='" + tille + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
