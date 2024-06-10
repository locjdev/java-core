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

        String lastName = fullName.substring(0, fullName.indexOf(" ")).trim();
        String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
        String firstName = fullName.substring(fullName.lastIndexOf(" "), fullName.length()).trim();

        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + firstName);
    }

    void question7() {
        System.out.println("Question-07");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        String fullName = scanner.nextLine();

        String[] words = fullName.split(" ");
        fullName = "";
        for (String word : words) {
            if (!word.isEmpty())
                fullName += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
        }
        fullName = fullName.trim();
        System.out.println("fullName = " + fullName);
    }

    void question10(String s1, String s2) {
        System.out.println("Question-10");
        if (s1.length() != s2.length()) {
            System.out.println("2 chuỗi không đối xứng");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                System.out.println("2 chuỗi không đối xứng");
                return;
            }
        }
        System.out.println("2 chuỗi đối xứng");
    }

    void question11(String s1) {
        System.out.println("Question-11");
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') count++;
        }
        System.out.println("Số kí tự a: " + count);
    }

    void question12(String s1) {
        System.out.println("Question-12");
        String result = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            result += s1.charAt(i);
        }
        System.out.println("Đảo ngược của " + s1 + " là: " + result);
    }

    void question13(String s1) {
        System.out.println("Question-13");
        if (s1 == null) {
            System.out.println("false");
            return;
        } else for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                System.out.println("false");
                return;
            }

        }
        System.out.println("true");
    }

    void question14(String s1, char oldChar, char newChar) {
        System.out.println("Question-14");
        System.out.println("s1 = " + s1.replace(oldChar, newChar));
    }

    void question15(String s1) {
        System.out.println("Question-15");
        String[] words = s1.split(" ");
        String s2 = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty())
                s2 += words[i] + " ";
        }
        System.out.println("s = " + s2.trim());
    }

    void question16(String s1, int n) {
        System.out.println("Question-16");
        if (s1.length() < n)
            System.out.println("KO");
        else {
            int length = s1.length();
            while (length >= n) {
                System.out.println("[" + s1.substring(0, n) + "]");
                length -= n;
                s1 = s1.substring(n, s1.length());
            }
        }
        System.out.println("[" + s1 + "]");
    }
}
