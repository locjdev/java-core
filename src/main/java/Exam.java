import java.time.LocalDate;

public class Exam {
    int examID;
    String code;
    String tille;
    int categoryID;
    int duration;
    int creatorID;
    LocalDate createDate;

    public Exam(int examID, String code, String tille, int categoryID, int duration, int creatorID, LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.tille = tille;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", code='" + code + '\'' +
                ", tille='" + tille + '\'' +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
