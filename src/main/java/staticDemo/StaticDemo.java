package staticDemo;

public class StaticDemo {
    public static void main(String[] args) {
        // Biến bình thường thuộc về đối tượng cụ thể
        // Biến static thuộc về tập thể class
        // new -> mỗi lần gọi cấp bộ nhớ 1 lần
        // static (Bộ nhớ dùng chung) -> chỉ cấp 1 lần đầu => Tiết kiệm bộ nhớ

        // Static property
        try {
            Student student1 = new Student(1, "Long");
            Student student2 = new Student(2, "Quân");
            Student student3 = new Student(3, "Linh");

            Student student4 = new Student("Long");
            System.out.println("student4 = " + student4);
            Student student5 = new Student("Quân");
            System.out.println("student5 = " + student5);
            Student student6 = new Student("Linh");
            System.out.println("student6 = " + student6);
            // Cách này vẫn được nhưng không nên dùng
            System.out.println("Số lượng học sinh: " + student1.getCount());
        } catch (IllegalStateException exception) {
            System.err.println(exception.getMessage());
        } finally {
            // Truy cập static thông qua class
            System.out.println("Số lượng học sinh: " + Student.getCount());
        }


        // Static method
        // Không tạo đối tượng math = new Math() vẫn dùng được phương thức max
        int max = Math.max(100, 1);
        System.out.println("max = " + max);
    }
}
