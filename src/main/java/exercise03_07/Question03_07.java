package exercise03_07;

import java.util.*;
import java.util.stream.Collectors;

public class Question03_07 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn Nam"));
        students.add(new Student(2, "Nguyễn Văn Huyên"));
        students.add(new Student(3, "Trần Văn Nam"));
        students.add(new Student(4, "Nguyễn Văn A"));

        // Tạo một Set chứa tên của các học sinh không trùng nhau
        Set<String> uniqueNames = new HashSet<>();
        for (Student student : students) {
            uniqueNames.add(student.getName());
        }

        // In ra Set chứa tên không trùng nhau
        System.out.println("Danh sách tên không trùng nhau:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Sắp xếp theo tên (bảng chữ cái)
        Collections.sort(students, Comparator.comparing(Student::getName));

        // In ra danh sách học sinh theo thứ tự bảng chữ cái
        System.out.println("\nDanh sách học sinh theo thứ tự bảng chữ cái:");
        for (Student student : students) {
            System.out.println(student);
        }

        Map<Integer, String> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getId, Student::getName));

        // In ra Map
        System.out.println("Map students:");
        studentMap.forEach((id, name) -> System.out.println("ID=" + id + ", Name=" + name));

        // Chuyển Map thành Set
        Set<Map.Entry<Integer, String>> studentSet = studentMap.entrySet();

        // In ra Set
        System.out.println("Set students:");
        for (Map.Entry<Integer, String> entry : studentSet) {
            System.out.println("ID=" + entry.getKey() + ", Name=" + entry.getValue());
        }
    }
}
