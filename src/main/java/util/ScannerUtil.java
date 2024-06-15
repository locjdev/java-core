package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input > 0) return input;
                else {
                    System.err.println("Yêu cầu nhập vào số nguyên dương.");
                    System.err.println("Nhập lại:");
                }
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên dương.");
                System.err.println("Nhập lại:");
            }
        }
    }


    public static float inputFloat() {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        while (true) {
            String email = scanner.nextLine();
            if (email.contains("@")) return email;
            else {
                System.out.println("Email phải chứa @");
                System.out.println("Nhập email");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String password = scanner.nextLine();
            if (password.length() > 5 && password.length() < 13) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) return password;
                    if (i == password.length() - 1) {
                        System.out.println("Password phải chứa ít nhất 1 kí tự viết hoa");
                        System.out.println("Nhập Password:");
                    }
                }
            } else {
                System.out.println("Password phải chứa 6-12 kí tự");
                System.out.println("Nhập Password:");
            }
        }
    }

    public static String inputFullName() {
        while (true) {
            boolean validFormat = true;
            String fullName = scanner.nextLine();
            for (int i = 0; i < fullName.length(); i++) {
                if (Character.isWhitespace(fullName.charAt(i))) continue;
                else if (!Character.isAlphabetic(fullName.charAt(i))) {
                    validFormat = false;
                    break;
                }
            }
            if (validFormat) return fullName;
            else {
                System.out.println("Yêu cầu chỉ chứa chữ cái");
                System.out.println("Nhập fullName");
            }
        }
    }
}

