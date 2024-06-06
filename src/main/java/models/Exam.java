package models;

import java.time.LocalDate;

public class Exam {
    int examID;
    String code;
    String tille;
    CategoryQuestion categoryID;
    int duration;
    Account creator;
    LocalDate createDate;

    public Exam(int examID, String code, String tille, CategoryQuestion categoryID, int duration, Account creator, LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.tille = tille;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "models.Exam{" +
                "examID=" + examID +
                ", code='" + code + '\'' +
                ", tille='" + tille + '\'' +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
