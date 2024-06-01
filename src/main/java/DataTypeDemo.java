import java.time.LocalDate;

// Class : Ban ve, Ban thiet ke
public class DataTypeDemo {
    //1. Property (Thuoc tinh)
    String name;
    int age;

    //2. Method (Phuong thuc)

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {


        //  8 kieu du lieu nguyen thuy
        // Kieu so nguyen
        // byte (1), short (2), int (4), long (8)

        int age = 18;
        System.out.println("age = " + age);

        // Kieu so thuc
        // float (4) dung 6-7 chu so, double (8) dung 15-16 chu so
        double PI = 3.141592653;
        float pi = 3.141592653F;
        System.out.println("pi = " + pi);

        // Kieu logic
        // boolean (1)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kieu ki tu
        // char (2) chua dung 1 ki tu
        char c = 'C';
        System.out.println("c = " + c);

        // Kieu xau ki tu
        // String
        String s = "Java Core";
        System.out.println("s = " + s);

        // Kieu thoi gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2019, 3, 19);
        System.out.println("date = " + date);

        // Kieu enum
        UIState state = UIState.LOADING;
        System.out.println("state = " + state);

        // Kieu array (mang)
        // mang kh the thay doi kich thuoc
        int[] numbers = {2, 5, 9, 4, 1};
        System.out.println("numbers.lenght = " + numbers.length);
        // Chi so: bat dau tu 0
        System.out.println("numbers[0] = " + numbers[0]);
        // Cach 2
        String[] fruits = new String[]{"Cam", "Tao", "Man"};
        // Cach 3
        char[] characters = new char[1];
        // Loi char[] characters = new char[-1];
        System.out.println("characters.length = " + characters.length);
        System.out.println("characters[0] = " + characters[0]);
        characters[0] = 'K';
        System.out.println("characters[0] = " + characters[0]);
    }
}
