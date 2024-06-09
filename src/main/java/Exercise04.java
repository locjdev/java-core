import java.util.Scanner;

public class Exercise04 {
    void question1() {
        System.out.println("Question-01");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty())
                count++;
        }
        System.out.println("Số từ là: " + count);
    }

    void question2() {
        System.out.println("Question-02");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự s1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào xâu kí tự s2:");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    void question3() {
        System.out.println("Question-03");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.next();
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(capitalizedName);
    }

    void question4() {
        System.out.println("Question-04");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.next().toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
        }
    }

    void question5() {
        System.out.println("Question-05");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ:");
        String lastName = scanner.next();
        System.out.println("Nhập tên:");
        String firstName = scanner.next();
        System.out.println("Họ và tên: " + lastName + " " + firstName);
    }

    void question6() {
        System.out.println("Question-06");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        String fullName = scanner.nextLine();

        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.lastIndexOf(" ");
        System.out.println("Họ là: " + lastName+" "+firstName);
    }
}
