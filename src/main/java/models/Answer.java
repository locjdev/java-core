package models;

public class Answer {
    int answerID;
    String content;
    Question question;
    boolean isCorrect;

    public Answer(int answerID, String content, Question question, boolean isCorrect) {
        this.answerID = answerID;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "models.Answer{" +
                "answerID=" + answerID +
                ", content='" + content + '\'' +
                ", questionID=" + question +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
