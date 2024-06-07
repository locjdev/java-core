package exercises;

import models.Account;
import models.Department;
import models.Position;
import models.PositionName;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercies2 {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();

    public static void main(String[] args) {
        // Question-01
        System.out.println("Question-01");
        int a = 5;
        System.out.printf("a = %d%n", a);
        System.out.println("--------------------");

        // Question-02
        System.out.println("Question-02");
        int b = 100000000;
        System.out.printf("b = %,d%n", b);
        System.out.println("--------------------");

        // Question-03
        System.out.println("Question-03");
        double c = 5.567098;
        System.out.printf("c = %.4f%n", c);
        System.out.println("--------------------");

        // Question-04
        System.out.println("Question-04");
        String name = "Nguyễn Văn A";
        System.out.printf("Tên tôi là %s và tôi đang độc thân%n", name);
        System.out.println("--------------------");

        // Question-05
        System.out.println("Question-05");
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("%02d/%02d/%04d %02dh:%02dp:%02ds%n", now.getDayOfMonth(), now.getMonthValue(), now.getYear(), now.getHour(), now.getMinute(), now.getSecond());
        System.out.println("--------------------");

        // Question-06
        System.out.println("Question-06");
        // Insert Data
        ArrayList<Account> accounts = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Position> positions = new ArrayList<>();

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

        for (Account account : accounts){
            System.out.printf("| Email |");
        }

        System.out.println("--------------------");

    }
}
