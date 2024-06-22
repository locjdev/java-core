package exercise01;

import java.util.*;

public class Question01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Tạo 6 sinh viên
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Alice"));
        students.add(new Student("Charlie"));
        students.add(new Student("David"));
        students.add(new Student("Eve"));

        // a) In ra tổng số phần tử của danh sách sinh viên
        System.out.println("Tổng số sinh viên: " + students.size());

        // b) Lấy phần tử thứ 4 của students
        Student student4 = students.get(3);
        System.out.println("Phần tử thứ 4: ID=" + student4.getId() + ", Name=" + student4.getName());

        // c) In ra phần tử đầu và phần tử cuối của students
        Student firstStudent = students.get(0);
        Student lastStudent = students.get(students.size() - 1);
        System.out.println("Phần tử đầu: ID=" + firstStudent.getId() + ", Name=" + firstStudent.getName());
        System.out.println("Phần tử cuối: ID=" + lastStudent.getId() + ", Name=" + lastStudent.getName());

        // d) Thêm 1 phần tử vào vị trí đầu của students
        students.add(0, new Student("Frank"));

        // e) Thêm 1 phần tử vào vị trí cuối của students
        students.add(new Student("Grace"));

        // f) Đảo ngược vị trí của students
        List<Student> reversedStudents = new ArrayList<>(students);
        Collections.reverse(reversedStudents);

        // g) Tạo 1 method tìm kiếm student theo id
        int searchId = 3;
        Student foundStudentById = findStudentById(students, searchId);
        if (foundStudentById != null) {
            System.out.println("Tìm kiếm theo ID=" + searchId + ": Name=" + foundStudentById.getName());
        } else {
            System.out.println("Không tìm thấy sinh viên với ID=" + searchId);
        }

        // h) Tạo 1 method tìm kiếm student theo name
        String searchName = "Alice";
        List<Student> foundStudentsByName = findStudentsByName(students, searchName);
        System.out.println("Tìm kiếm theo tên '" + searchName + "':");
        for (Student student : foundStudentsByName) {
            System.out.println("ID=" + student.getId() + ", Name=" + student.getName());
        }

        // i) Tạo 1 method để in ra các student có trùng tên
        List<Student> duplicateNameStudents = findDuplicateNameStudents(students);
        System.out.println("Các sinh viên có tên trùng nhau:");
        for (Student student : duplicateNameStudents) {
            System.out.println("ID=" + student.getId() + ", Name=" + student.getName());
        }

        // j) Xóa name của student có id = 2
        int studentIdToDeleteName = 2;
        Student studentToDeleteName = findStudentById(students, studentIdToDeleteName);
        if (studentToDeleteName != null) {
            studentToDeleteName.setName(null);
        }

        // k) Delete student có id = 5
        int studentIdToDelete = 5;
        students.removeIf(student -> student.getId() == studentIdToDelete);

        // l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
        List<Student> studentCopies = new ArrayList<>(students);

        // In ra danh sách studentCopies
        System.out.println("Danh sách studentCopies:");
        for (Student student : studentCopies) {
            System.out.println("ID=" + student.getId() + ", Name=" + student.getName());
        }

    }

    // Method tìm kiếm student theo id
    private static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Method tìm kiếm student theo name
    private static List<Student> findStudentsByName(List<Student> students, String name) {
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

    // Method tìm kiếm các student có trùng tên
    private static List<Student> findDuplicateNameStudents(List<Student> students) {
        Map<String, Integer> nameCountMap = new HashMap<>();
        List<Student> duplicateNameStudents = new ArrayList<>();

        for (Student student : students) {
            String name = student.getName();
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        for (Student student : students) {
            String name = student.getName();
            if (nameCountMap.get(name) > 1) {
                duplicateNameStudents.add(student);
            }
        }

        return duplicateNameStudents;
    }

}

