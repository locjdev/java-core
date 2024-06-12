package exercise04;

public class Program {

    public static void main(String[] args) {
        // Khởi tạo một sinh viên
        Student student1 = new Student("1", "Nguyen Van A", "Hanoi");

        // Set điểm cho sinh viên
        student1.setGrade(7.5);

        // Cộng thêm điểm cho sinh viên
        student1.addGrade(0.5);

        // In ra thông tin của sinh viên sau khi cộng thêm điểm
        student1.printStudentInfo();

    }
}
