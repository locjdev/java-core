import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Mặc định kh tạo Constructor thì java mặc định constructor kh tham số
        // Constructor: Hàm khởi tạo
        // 1.  Tên constructor trùng với tên class
        // 2. Constructor không có kiểu dữ liệu trả về

        Dog dog = new Dog("Long", 2);
        System.out.println("dog = " + dog);

        Dog dog2 = new Dog(2);
        System.out.println("dog2 = " + dog2);
    }
}
