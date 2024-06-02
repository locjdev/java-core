public class Answer {
    int answerID;
    String content;
    int questionID;
    boolean isCorrect;

    public Answer(int answerID, String content, int questionID, boolean isCorrect) {
        this.answerID = answerID;
        this.content = content;
        this.questionID = questionID;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerID=" + answerID +
                ", content='" + content + '\'' +
                ", questionID=" + questionID +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
