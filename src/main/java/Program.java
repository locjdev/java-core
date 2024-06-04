import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department_01 = new Department(1, "Sale");
        Department department_02 = new Department(2, "Sale");
        Department department_03 = new Department(3, "Marketing");
        System.out.println("department_01 = " + department_01);

        Position positon_01 = new Position(1, PositionName.DEV);
        Position positon_02 = new Position(2, PositionName.PM);
        Position positon_03 = new Position(3, PositionName.SCRUM_MASTER);
        System.out.println("positon_01 = " + positon_01);

        Account account_01 = new Account(1, "account1@gmail.com", "account01", "Nguyen van A", department_01, positon_01, LocalDate.now());
        Account account_02 = new Account(2, "account2@gmail.com", "account02", "Nguyen van B", department_02, positon_02, LocalDate.now());
        Account account_03 = new Account(3, "account3@gmail.com", "account03", "Nguyen van C", department_03, positon_03, LocalDate.now());
        System.out.println("account_01 = " + account_01);

        Group group_01 = new Group(1, "group_01", 1, LocalDate.now());
        Group group_02 = new Group(2, "group_02", 2, LocalDate.now());
        Group group_03 = new Group(3, "group_03", 3, LocalDate.now());
        System.out.println("group_01 = " + group_01);

        GroupAccount groupAccount_01 = new GroupAccount(1, 1, LocalDate.now());
        GroupAccount groupAccount_02 = new GroupAccount(2, 2, LocalDate.now());
        GroupAccount groupAccount_03 = new GroupAccount(3, 3, LocalDate.now());
        System.out.println("groupAccount_01 = " + groupAccount_01);

        TypeQuestion typeQuestion_01 = new TypeQuestion(1, TypeName.ESSAY);
        TypeQuestion typeQuestion_02 = new TypeQuestion(2, TypeName.ESSAY);
        TypeQuestion typeQuestion_03 = new TypeQuestion(3, TypeName.MULTIPLE_CHOICE);
        System.out.println("typeQuestion_01 = " + typeQuestion_01);

        CategoryQuestion categoryQuestion_01 = new CategoryQuestion(1, "Java");
        CategoryQuestion categoryQuestion_02 = new CategoryQuestion(2, ".NET");
        CategoryQuestion categoryQuestion_03 = new CategoryQuestion(3, "SQL");
        System.out.println("categoryQuestion_01 = " + categoryQuestion_01);

        Question question_01 = new Question(1, "Câu hỏi 1", 1, 1, 1, LocalDate.now());
        Question question_02 = new Question(2, "Câu hỏi 2", 2, 2, 2, LocalDate.now());
        Question question_03 = new Question(3, "Câu hỏi 3", 3, 3, 3, LocalDate.now());
        System.out.println("question_01 = " + question_01);

        Answer answer_01 = new Answer(1,"Câu trả lơời 1",1,true);
        Answer answer_02 = new Answer(2,"Câu trả lơời 2",1,false);
        Answer answer_03 = new Answer(3,"Câu trả lơời 3",1,true);
        System.out.println("answer_01 = " + answer_01);

        Exam exam_01 = new Exam(1,"code1","Đề thi 1",1,90,1,LocalDate.now());
        Exam exam_02 = new Exam(2,"code2","Đề thi 2",2,60,2,LocalDate.now());
        Exam exam_03 = new Exam(3,"code3","Đề thi 3",3,120,3,LocalDate.now());
        System.out.println("exam_01 = " + exam_01);

        ExamQuestion examQuestion_01 = new ExamQuestion(1,1);
        ExamQuestion examQuestion_02 = new ExamQuestion(2,2);
        ExamQuestion examQuestion_03 = new ExamQuestion(3,3);
        System.out.println("examQuestion_01 = " + examQuestion_01);
    }
}
