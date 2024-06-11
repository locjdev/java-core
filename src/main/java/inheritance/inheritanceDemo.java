package inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {
        // Sự kế thừa
        // Từ khóa extends;
        // Mục đích: tái sử dụng code
        Duck duck = new Duck("Long",2);
        duck.eat();

        // @Override: ghi đè
        duck.eat();

        // Từ khóa: super
        duck.eat();
        System.out.println("duck = " + duck);
    }
}
