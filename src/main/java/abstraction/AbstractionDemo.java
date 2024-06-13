package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // Abstract class
        // Trừu tượng không hoàn toàn (<100%)
        // Vì trong class Shape có phương thức kh phải abstract
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());
        // Abstract class không thể khởi tạo Shape shape = new Shape();

        // Interface
        // Trừu tượng hoàn toàn (100%)
        // Mặc định: public abstract
    }
}
