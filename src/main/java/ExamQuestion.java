public class ExamQuestion {
    int examID;
    int questionID;

    public ExamQuestion(int examID, int questionID) {
        this.examID = examID;
        this.questionID = questionID;
    }

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "examID=" + examID +
                ", questionID=" + questionID +
                '}';
    }
}
