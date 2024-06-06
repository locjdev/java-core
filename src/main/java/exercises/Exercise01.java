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

    private void checkDepartmentByTenary(Account account) {
        System.out.println(account == null ? "Account không tồn tại" :
                account.getDepartment() == null ? "Nhân viên " + account.getFullname() + " chưa có phòng ban" :
                        "Phòng ban của nhân viên " + account.getFullname() + " là: " + account.getDepartment().getDepartmentName());
    }

    private void checkGroupBySwitchCase(Account account) {
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

    private void checkGroupByIf(Account account) {
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
            if (countGroup == 0) {
                System.out.println("Nhân viên " + account.getFullname() + " chưa có group");
            } else if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên " + account.getFullname() + " là " + groupNames);
            } else if (countGroup == 3) {
                System.out.println("Nhân viên " + account.getFullname() + " là người quan trọng, tham gia nhiều group");
            } else {
                System.out.println("Nhân viên " + account.getFullname() + " là hóng chuyện, tham gia tất cả group");
            }
        }
    }

    private void checkPositionByIf(Account account) {
        System.out.println(
                account.getPosition() == null ? "Account không tồn tại" :
                        account.getPosition().getPositionName() == PositionName.DEV ? account.getFullname() + " là Developer" : account.getFullname() + " không phải là Developer"
        );
    }

    private void checkPositionBySwitchCase(Account account) {
        if (account == null || account.getPosition() == null) {
            System.out.println("Account không tồn tại");
        } else {
            switch (account.getPosition().getPositionName()) {
                case DEV:
                    System.out.println(account.getFullname() + " là Developer");
                    break;
                default:
                    System.out.println(account.getFullname() + " không phải là Developer");
                    break;
            }
        }
    }

    private void countAccountInGroup(Group group) {
        int count = 0;
        for (GroupAccount groupAccount : groupAccounts)
            count += (group.getGroupID() == groupAccount.getGroup().getGroupID()) ? 1 : 0;

        switch (count) {
            case 1:
                System.out.println("Nhóm " + group.getGroupName() + " có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm " + group.getGroupName() + " có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm " + group.getGroupName() + " có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm " + group.getGroupName() + " có nhiều thành viên");
                break;
        }
    }

    private void printAccount() {
        for (Account account : accounts) {
            if (account != null) {
                String email = account.getEmail() != null ? account.getEmail() : "N/A";
                String fullname = account.getFullname() != null ? account.getFullname() : "N/A";
                String departmentName = (account.getDepartment() != null && account.getDepartment().getDepartmentName() != null) ? account.getDepartment().getDepartmentName() : "N/A";
                System.out.println("Account[" + account.getAccountID() + "] | " + " Email: " + email + " | FullName: " + fullname + " | DepartmentName: " + departmentName);
            }
        }
    }

    private void printDepartment() {
        for (Department department : departments) {
            if (department != null) {
                String departmentName = department.getDepartmentName() != null ? department.getDepartmentName() : "N/A";
                System.out.println("Department[" + department.getDepartmentID() + "] | " + " DepartmentName: " + departmentName);
            }
        }
    }

    private void printAccountWithFomat() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) != null) {
                System.out.println("Thông tin account thứ " + accounts.get(i).getAccountID() + " là:");
                System.out.println(accounts.get(i).getEmail() != null ? "Email: " + accounts.get(i).getEmail() : "Email: N/A");
                System.out.println(accounts.get(i).getFullname() != null ? "Full name: " + accounts.get(i).getFullname() : "Full name: N/A");
                System.out.println((accounts.get(i).getDepartment() != null && accounts.get(i).getDepartment().getDepartmentName() != null) ? "Phòng ban: " + accounts.get(i).getDepartment().getDepartmentName() : "Phòng ban: N/A");
                System.out.println("**********");
            }
        }
    }

    private void printDepartmentWithFomat() {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i) != null) {
                System.out.println("Thông tin department thứ " + departments.get(i).getDepartmentID() + " là");
                System.out.println("Id: " + departments.get(i).getDepartmentID());
                System.out.println(departments.get(i).getDepartmentName() != null ? "Name:" + departments.get(i).getDepartmentName() : "Name: N/A");
                System.out.println("**********");
            }
        }
    }

    private void printAllAccountsExceptSecond() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) != null && i!=1) {
                System.out.println("Thông tin account thứ " + accounts.get(i).getAccountID() + " là:");
                System.out.println(accounts.get(i).getEmail() != null ? "Email: " + accounts.get(i).getEmail() : "Email: N/A");
                System.out.println(accounts.get(i).getFullname() != null ? "Full name: " + accounts.get(i).getFullname() : "Full name: N/A");
                System.out.println((accounts.get(i).getDepartment() != null && accounts.get(i).getDepartment().getDepartmentName() != null) ? "Phòng ban: " + accounts.get(i).getDepartment().getDepartmentName() : "Phòng ban: N/A");
                System.out.println("**********");
            }
        }
    }

    private void printAccountsWithIDLessThan4() {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i) != null) {
                System.out.println("Thông tin department thứ " + departments.get(i).getDepartmentID() + " là");
                System.out.println("Id: " + departments.get(i).getDepartmentID());
                System.out.println(departments.get(i).getDepartmentName() != null ? "Name:" + departments.get(i).getDepartmentName() : "Name: N/A");
                System.out.println("**********");
            }

        }
    }

    private void printEvenNumbersUpTo20(){
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private void printAllAccountsExceptSecondUsingWhile() {
        int i = 0;
        while (i < accounts.size()) {
            if (i != 1) { // Bỏ qua account thứ 2 (index 1)
                Account account = accounts.get(i);
                if (account != null) {
                    String email = account.getEmail() != null ? account.getEmail() : "N/A";
                    String fullname = account.getFullname() != null ? account.getFullname() : "N/A";
                    String departmentName = (account.getDepartment() != null && account.getDepartment().getDepartmentName() != null) ? account.getDepartment().getDepartmentName() : "N/A";

                    System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                    System.out.println("Email: " + email);
                    System.out.println("Full name: " + fullname);
                    System.out.println("Phòng ban: " + departmentName);
                    System.out.println("**********");
                }
            }
            i++;
        }
    }

    private void printAllAccountsExceptSecondUsingDoWhile() {
        if (accounts.isEmpty()) {
            return;
        }

        int i = 0;
        do {
            if (i != 1) { // Bỏ qua account thứ 2 (index 1)
                Account account = accounts.get(i);
                if (account != null) {
                    String email = account.getEmail() != null ? account.getEmail() : "N/A";
                    String fullname = account.getFullname() != null ? account.getFullname() : "N/A";
                    String departmentName = (account.getDepartment() != null && account.getDepartment().getDepartmentName() != null) ? account.getDepartment().getDepartmentName() : "N/A";

                    System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                    System.out.println("Email: " + email);
                    System.out.println("Full name: " + fullname);
                    System.out.println("Phòng ban: " + departmentName);
                    System.out.println("**********");
                }
            }
            i++;
        } while (i < accounts.size());
    }


    private void printFirstTwoDepartments() {
        for (int i = 0; i < 2; i++) {
            if (departments.get(i) != null) {
                System.out.println("Thông tin department thứ " + departments.get(i).getDepartmentID() + " là");
                System.out.println("Id: " + departments.get(i).getDepartmentID());
                System.out.println(departments.get(i).getDepartmentName() != null ? "Name:" + departments.get(i).getDepartmentName() : "Name: N/A");
                System.out.println("**********");
            }
        }
    }

    public static void main(String[] args) {
        // Insert values
        Exercise01 exercise01 = new Exercise01();
        exercise01.insertValues();

        //IF
        System.out.println("--- IF ---");
        //Question-01
        System.out.println("Question-01:");
        exercise01.checkDepartment(exercise01.accounts.get(1));
        exercise01.checkDepartment(exercise01.accounts.get(3));
        exercise01.checkDepartment(exercise01.accounts.get(2));
        System.out.println("-----------------------------------");

        //Question-02
        System.out.println("Question-02:");
        exercise01.checkGroupByIf(exercise01.accounts.get(0));
        exercise01.checkGroupByIf(exercise01.accounts.get(1));
        exercise01.checkGroupByIf(exercise01.accounts.get(2));
        System.out.println("-----------------------------------");

        //Question-03
        System.out.println("Question-03:");
        exercise01.checkDepartmentByTenary(exercise01.accounts.get(1));
        exercise01.checkDepartmentByTenary(exercise01.accounts.get(2));
        exercise01.checkDepartmentByTenary(exercise01.accounts.get(3));
        System.out.println("-----------------------------------");

        //Question-04
        System.out.println("Question-04:");
        exercise01.checkPositionByIf(exercise01.accounts.get(1));
        exercise01.checkPositionByIf(exercise01.accounts.get(0));
        System.out.println("-----------------------------------");

        // SWITCH CASE
        System.out.println("--- SWITCH CASE ---");
        //Question-05
        System.out.println("Question-05:");
        exercise01.countAccountInGroup(exercise01.groups.get(0));
        exercise01.countAccountInGroup(exercise01.groups.get(1));
        exercise01.countAccountInGroup(exercise01.groups.get(2));
        System.out.println("-----------------------------------");

        //Question-06
        System.out.println("Question-06:");
        exercise01.checkGroupBySwitchCase(exercise01.accounts.get(0));
        exercise01.checkGroupBySwitchCase(exercise01.accounts.get(1));
        exercise01.checkGroupBySwitchCase(exercise01.accounts.get(2));
        System.out.println("-----------------------------------");

        //Question-07
        System.out.println("Question-07:");
        exercise01.checkPositionBySwitchCase(exercise01.accounts.get(1));
        exercise01.checkPositionBySwitchCase(exercise01.accounts.get(0));
        System.out.println("-----------------------------------");

        // FOR EACH
        System.out.println("--- FOREACH ---");

        //Question-08
        System.out.println("Question-08:");
        exercise01.printAccount();
        System.out.println("-----------------------------------");

        //Question-09
        System.out.println("Question-09:");
        exercise01.printDepartment();
        System.out.println("-----------------------------------");

        // FOR
        System.out.println("--- FOR ---");

        //Question-10
        System.out.println("Question-10:");
        exercise01.printAccountWithFomat();
        System.out.println("-----------------------------------");

        //Question-11
        System.out.println("Question-11:");
        exercise01.printDepartmentWithFomat();
        System.out.println("-----------------------------------");

        //Question-12
        System.out.println("Question-12:");
        exercise01.printFirstTwoDepartments();
        System.out.println("-----------------------------------");

        //Question-13
        System.out.println("Question-13:");
        exercise01.printAllAccountsExceptSecond();
        System.out.println("-----------------------------------");

        //Question-14
        System.out.println("Question-14:");
        exercise01.printAccountsWithIDLessThan4();
        System.out.println("-----------------------------------");

        //Question-15
        System.out.println("Question-15:");
        exercise01.printEvenNumbersUpTo20();
        System.out.println("-----------------------------------");

        //Question-16
        System.out.println("Question-16:");
        exercise01.printAllAccountsExceptSecondUsingWhile();
        System.out.println("-----------------------------------");

        //Question-17
        System.out.println("Question-17:");
        exercise01.printAllAccountsExceptSecondUsingDoWhile();
        System.out.println("-----------------------------------");

    }
}
