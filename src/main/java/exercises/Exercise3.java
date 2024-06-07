package exercises;

import models.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercise3 {
    private ArrayList<Exam> exams = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<CategoryQuestion> categoryQuestions = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Position> positions = new ArrayList<>();

    private void insertData() {
        departments.add(new Department(1, "Sale"));
        departments.add(new Department(2, "Sale"));
        departments.add(new Department(3, "Marketing"));

        positions.add(new Position(1, PositionName.DEV));
        positions.add(new Position(2, PositionName.PM));
        positions.add(new Position(3, PositionName.SCRUM_MASTER));

        accounts.add(new Account(1, "account1@gmail.com", "account01", "Nguyen van A", departments.get(0), positions.get(0), LocalDate.now()));
        accounts.add(new Account(2, "account2@gmail.com", "account02", "Nguyen van B", null, positions.get(1), LocalDate.now()));
        accounts.add(new Account(3, "account3@gmail.com", "account03", "Nguyen van C", departments.get(2), positions.get(2), LocalDate.now()));
        accounts.add(null);

        categoryQuestions.add(new CategoryQuestion(1, "Java"));
        categoryQuestions.add(new CategoryQuestion(2, ".NET"));
        categoryQuestions.add(new CategoryQuestion(3, "SQL"));

        exams.add(new Exam(1, "code1", "Đề thi 1", categoryQuestions.get(0), 90, accounts.get(0), LocalDate.now()));
        exams.add(new Exam(2, "code2", "Đề thi 2", categoryQuestions.get(1), 60, accounts.get(1), LocalDate.now()));
        exams.add(new Exam(3, "code3", "Đề thi 3", categoryQuestions.get(2), 120, accounts.get(2), LocalDate.now()));
    }

    private void printFirstExam() {
        Exam exam = exams.get(0);
        System.out.println("Exam 1" + "| Code: " + exam.getCode() + " | Title: " + exam.getTille() + " | Category: " + exam.getCategory().getCategoryName() + " | Duration: " + exam.getDuration() + " | Creator: " + exam.getCreator().getFullname());

        LocalDate createDate = exam.getCreateDate();
        System.out.printf("Create Date: Ngày %2d Tháng %2d Năm %4d%n", createDate.getDayOfMonth(), createDate.getMonthValue(), createDate.getYear());
    }

    private void printExamCreationDate() {
        for (Exam exam : exams) {
            LocalDateTime createDate = exam.getCreateDate().atStartOfDay();
            System.out.printf("Exam "+exam.getExamID()+"| Create Date: Năm %4d-Tháng %2d-Ngày %2d-Giờ %2d-Phút %2d-Giây %2d%n", createDate.getYear(), createDate.getMonthValue(), createDate.getDayOfMonth(), createDate.getHour(), createDate.getMinute(), createDate.getSecond());
        }
    }

    private void printExamYearOfCreationDate() {
        for (Exam exam : exams) {
            LocalDate createDate = exam.getCreateDate();
            System.out.printf("Exam "+exam.getExamID()+"| Create Date: Năm %4d%n", createDate.getYear());
        }
    }

    private void printExamMonthAndYearOfCreationDate() {
        for (Exam exam : exams) {
            LocalDate createDate = exam.getCreateDate();
            System.out.printf("Exam "+exam.getExamID()+"| Create Date: Năm %4d-Tháng %2d%n", createDate.getYear(),createDate.getMonthValue());
        }
    }

    private void printExamDayAndMonthOfCreationDate() {
        for (Exam exam : exams) {
            LocalDate createDate = exam.getCreateDate();
            System.out.printf("Exam "+exam.getExamID()+"| Create Date: Tháng %2d-Ngày %2d%n",createDate.getMonthValue(),createDate.getDayOfMonth());
        }
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        exercise3.insertData();

        // Question-01
        System.out.println("Question-01");
        exercise3.printFirstExam();
        System.out.println("--------------------");

        // Question-02
        System.out.println("Question-02");
        exercise3.printExamCreationDate();
        System.out.println("--------------------");

        // Question-03
        System.out.println("Question-03");
        exercise3.printExamYearOfCreationDate();
        System.out.println("--------------------");

        // Question-04
        System.out.println("Question-04");
        exercise3.printExamMonthAndYearOfCreationDate();
        System.out.println("--------------------");

        // Question-05
        System.out.println("Question-05");
        exercise3.printExamDayAndMonthOfCreationDate();
        System.out.println("--------------------");
    }
}
