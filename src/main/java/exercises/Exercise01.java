package exercises;

import models.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exercise01 {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Position> positions = new ArrayList<>();
    private ArrayList<Group> groups = new ArrayList<>();
    private ArrayList<GroupAccount> groupAccounts = new ArrayList<>();
    private ArrayList<TypeQuestion> typeQuestions = new ArrayList<>();
    private ArrayList<CategoryQuestion> categoryQuestions = new ArrayList<>();
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Answer> answers = new ArrayList<>();
    private ArrayList<Exam> exams = new ArrayList<>();
    private ArrayList<ExamQuestion> examQuestions = new ArrayList<>();

    private void insertValues() {
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

        groups.add(new Group(1, "group Fresher C++", accounts.get(0), LocalDate.now()));
        groups.add(new Group(2, "group Inter Java", accounts.get(1), LocalDate.now()));
        groups.add(new Group(3, "group Inter C#", accounts.get(2), LocalDate.now()));

        groupAccounts.add(new GroupAccount(groups.get(0), accounts.get(0), LocalDate.now()));
        groupAccounts.add(new GroupAccount(groups.get(1), accounts.get(1), LocalDate.now()));
        groupAccounts.add(new GroupAccount(groups.get(2), accounts.get(2), LocalDate.now()));
        // account 2 tham gia 3 group
        groupAccounts.add(new GroupAccount(groups.get(2), accounts.get(1), LocalDate.now()));
        groupAccounts.add(new GroupAccount(groups.get(0), accounts.get(1), LocalDate.now()));
        // account 3 tham gia 2 group
        groupAccounts.add(new GroupAccount(groups.get(0), accounts.get(2), LocalDate.now()));

        typeQuestions.add(new TypeQuestion(1, TypeName.ESSAY));
        typeQuestions.add(new TypeQuestion(2, TypeName.ESSAY));
        typeQuestions.add(new TypeQuestion(3, TypeName.MULTIPLE_CHOICE));

        categoryQuestions.add(new CategoryQuestion(1, "Java"));
        categoryQuestions.add(new CategoryQuestion(2, ".NET"));
        categoryQuestions.add(new CategoryQuestion(3, "SQL"));

        questions.add(new Question(1, "Câu hỏi 1", categoryQuestions.get(0), typeQuestions.get(0), accounts.get(0), LocalDate.now()));
        questions.add(new Question(2, "Câu hỏi 2", categoryQuestions.get(1), typeQuestions.get(1), accounts.get(1), LocalDate.now()));
        questions.add(new Question(3, "Câu hỏi 3", categoryQuestions.get(2), typeQuestions.get(2), accounts.get(2), LocalDate.now()));

        answers.add(new Answer(1, "Câu trả lời 1", questions.get(0), true));
        answers.add(new Answer(2, "Câu trả lời 2", questions.get(1), false));
        answers.add(new Answer(3, "Câu trả lời 3", questions.get(2), true));

        exams.add(new Exam(1, "code1", "Đề thi 1", categoryQuestions.get(0), 90, accounts.get(0), LocalDate.now()));
        exams.add(new Exam(2, "code2", "Đề thi 2", categoryQuestions.get(1), 60, accounts.get(1), LocalDate.now()));
        exams.add(new Exam(3, "code3", "Đề thi 3", categoryQuestions.get(2), 120, accounts.get(2), LocalDate.now()));

        examQuestions.add(new ExamQuestion(exams.get(0), questions.get(0)));
        examQuestions.add(new ExamQuestion(exams.get(1), questions.get(1)));
        examQuestions.add(new ExamQuestion(exams.get(2), questions.get(2)));

    }

    private void checkDepartment(Account account) {
        if (account == null) {
            System.out.println("Account không tồn tại");
        } else if (account.getDepartment() == null) {
            System.out.println("Nhân viên " + account.getFullname() + " chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên " + account.getFullname() + " là: " + account.getDepartment().getDepartmentName());
        }
    }

    private void checkDepartmentWithTenary(Account account) {
        System.out.println(account == null ? "Account không tồn tại" :
                account.getDepartment() == null ? "Nhân viên " + account.getFullname() + " chưa có phòng ban" :
                        "Phòng ban của nhân viên " + account.getFullname() + " là: " + account.getDepartment().getDepartmentName());
    }

    private void checkGroup(Account account) {
        if (account == null) {
            System.out.println("Account không tồn tại");
        } else {
            int countGroup = 0;
            String groupNames = "";
            for (int i = 0; i < groupAccounts.size(); i++) {
                if (groupAccounts.get(i).getAccount().getAccountID() == account.getAccountID()) {
                    countGroup++;
                    for (Group group : groups)
                        if (group.getGroupID() == groupAccounts.get(i).getGroup().getGroupID())
                            groupNames += group.getGroupName() + " ";
                }
            }
            switch (countGroup) {
                case 0:
                    System.out.println("Nhân viên " + account.getFullname() + " chưa có group");
                    break;
                case 1:
                case 2:
                    System.out.println("Group của nhân viên " + account.getFullname() + " là " + groupNames);
                    break;
                case 3:
                    System.out.println("Nhân viên " + account.getFullname() + " là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên " + account.getFullname() + " là hóng chuyện, tham gia tất cả group");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Insert values
        Exercise01 exercise01 = new Exercise01();
        exercise01.insertValues();

        //Question-01
        System.out.println("Question-01:");
        exercise01.checkDepartment(exercise01.accounts.get(1));
        exercise01.checkDepartment(exercise01.accounts.get(3));
        exercise01.checkDepartment(exercise01.accounts.get(2));
        System.out.println("-----------------------------------");

        //Question-02
        System.out.println("Question-02:");
        exercise01.checkGroup(exercise01.accounts.get(0));
        exercise01.checkGroup(exercise01.accounts.get(1));
        exercise01.checkGroup(exercise01.accounts.get(2));
        System.out.println("-----------------------------------");

        //Question-03
        System.out.println("Question-03:");
        exercise01.checkDepartmentWithTenary(exercise01.accounts.get(1));
        exercise01.checkDepartmentWithTenary(exercise01.accounts.get(2));
        exercise01.checkDepartmentWithTenary(exercise01.accounts.get(3));
        System.out.println("-----------------------------------");
    }
}
