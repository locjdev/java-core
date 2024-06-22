package generic;

public class GenericDemo {
    public static void main(String[] args) {
        // Lập trình tổng quát

        // Quy ước
        // T - Type: Kiểu dữ liệu
        // E - Element: Mảng
        // N - Number: Số
        // K - Key
        // V - Value


        // generic class / interface
        Dog<Integer> dog1 = new Dog<>("Long", 1);
        System.out.println("dog1 = " + dog1);

        Dog<Double> dog2 = new Dog<>("Khoa", 2.5);
        System.out.println("dog2 = " + dog2);

        // generic method
        Printer.printAny(4);
        Printer.printAny(4.5);
        Printer.printAny(dog1);

        // bounded type: giới hạn lại kiểu dữ liệu có thể nhận được
        // Dog<String> dog3 = new Dog<>("Tùng", "ABC"); Lỗi

        // multiple bounds:
        // public static <T extends Number & Comparable<T>> T max(T a, T b) {return...}
        int max = Math.max(99, 1);
        System.out.println("max = " + max);
    }
}
