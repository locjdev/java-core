public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive: kieu du nguyen thuy: 8 loai (viet thuong)
        // Default value so va char = 0, boolean: false
        // char 0 -> 255;
        // Luu trong stack -> neu 2 so cung gia tri se tro ve 1 vi tri trong stack
        // dung == ( so sanh dua tren vi tri bo nho )de so sanh

        // Wrapper class: class cua cac kieu nguyen thuy tuong ung. VD: Integer, Double

        // Non-Primitive: cac du lieu con lai (viet hoa chu cai dau)
        // Default value la null
        // Khoi tao phai dung new
        // Su dung equals de so sanh
        // Luu trong heap ->

        // Primitive         Wrapper Class
        // byte              Byte
        // short             Short
        // int               Integer
        // long              Long
        // float             Float
        // double            Double
        // char              Character
        // boolean           Boolean

        // Boxing: dong hop: chuyen qua lai giua primitive -> wrapper class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing: chuyen tu wrapper class -> primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ứng dụng:
        // 1. Kiểm tra kí tự in hoa, in thường,...
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isAlphabetic('@') = " + Character.isAlphabetic('@'));

        // 2. Chuyển String sang số
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println("s + 10 = " + s + 10);
        System.out.println("n + 10 = " + n + 10);
        double m = Double.parseDouble("123.456");
        System.out.println("m +10 = " + m + 10);
    }
}
