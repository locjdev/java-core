package exercises;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();

        //Question-1
        System.out.println("Question-1:");
        int a = random.nextInt();
        System.out.println("Số nguyên ngẫu nhiên: " + a);
        System.out.println("-----------------------------------");

        //Question-2
        System.out.println("Question-2:");
        double b = random.nextDouble();
        System.out.println("Số thực ngẫu nhiên: " + b);
        System.out.println("-----------------------------------");

        //Question-3
        System.out.println("Question-3:");
        String[] students = {"Lộc", "Long", "Khoa"};
        int i = random.nextInt(3);
        System.out.println("students[i] = " + students[i]);
        System.out.println("-----------------------------------");

        //Question-4
        System.out.println("Question-4:");
        int randomMonth = 7 + random.nextInt(6);
        int randomDay = 0;
        switch (randomMonth) {
            case 7:
                randomDay = 24 + random.nextInt(8);
                break;
            case 8:
                randomDay = 1 + random.nextInt(31);
                break;
            case 9:
            case 11:
                randomDay = 1 + random.nextInt(30);
                break;
            case 10:
                randomDay = 1 + random.nextInt(31);
                break;
            case 12:
                randomDay = 1 + random.nextInt(20);
                break;
        }
        System.out.println("Ngày và tháng ngẫu nhiên: " + randomDay + "-" + randomMonth + "-1995");
        System.out.println("-----------------------------------");

        //Question-5
        System.out.println("Question-5:");
        int randomYear2 = LocalDate.now().getYear();
        // tu 6/8/2024 den 6/8/2024
        int randomMonth2 = 7 + random.nextInt(6);
        int randomDay2 = 0;

        switch (randomMonth2) {
            case 7:
                randomDay2 = 24 + random.nextInt(8);
                break;
            case 8:
                randomDay2 = 1 + random.nextInt(31);
                break;
            case 9:
            case 11:
                randomDay2 = 1 + random.nextInt(30);
                break;
            case 10:
                randomDay2 = 1 + random.nextInt(31);
                break;
            case 12:
                randomDay2 = 1 + random.nextInt(20);
                break;
        }
        System.out.println("Ngày và tháng ngẫu nhiên: " + randomDay2 + "-" + randomMonth2 + "-1995");
        System.out.println("-----------------------------------");
    }
}
