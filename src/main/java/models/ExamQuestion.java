package models;

public class ExamQuestion {
    Exam exam;
    Question question;

    public ExamQuestion(Exam exam, Question questionID) {
        this.exam = exam;
        this.question = questionID;
    }

    @Override
    public String toString() {
        return "models.ExamQuestion{" +
                "exam=" + exam +
                ", question=" + question +
                '}';
    }
}
