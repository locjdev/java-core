import java.util.Random;

public class Exercise01 {
    void question1() {
        System.out.println("question-01");
        float account1Salary = 5240.5f;
        float account2Salary = 10970.055f;

        int salaryAccount1 = (int) account1Salary;
        int salaryAccount2 = (int) account2Salary;

        System.out.println("account1salary = " + salaryAccount1);
        System.out.println("account2Salary = " + salaryAccount2);
    }

    void question2() {
        System.out.println("question-02");
        Random random = new Random();
        int number = random.nextInt(100000);
        String numberStr = number + "";
        while (numberStr.length() < 5) {
            numberStr = "0" + numberStr;
        }
        System.out.println("Random Number = " + numberStr);
    }

    void question4(int a, int b) {
        System.out.println("question-04");
        System.out.println("a/b = " + (double) a / b);

    }
}
