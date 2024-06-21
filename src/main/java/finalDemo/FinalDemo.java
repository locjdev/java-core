package finalDemo;

public class FinalDemo {
    public static void main(String[] args) {
        // Final variable
        final double pi = 3.1415;
        // pi = 5; lỗi

        // Final method
        Dog dog = new Dog();
        dog.run();

        // Final class
        // Không có class nào có thể kế thừa final class => final class không có class con

        // Constant (Hằng số)
        System.out.println("Math.PI = " + Math.PI);
        // Math.PI = 5; Lỗi
    }
}
