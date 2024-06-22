package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // ArrayList yêu cầu bộ nhớ phải liền kề nhau
        // ArrayList: truy vấn o(1), xóa o(n)

        // LinkedList không yêu cầu bộ nhớ liền kề nhau
        // LinkedList: truy vấn o(n), xóa o(1)

//        List<String> students = new ArrayList<>();

        // LinkedList
        List<String> students = new LinkedList<>();

        students.add("Long");
        // ["Long"]
        students.add("Huy");
        // ["Long", "Huy"]
        students.add(0, "Đạt");
        // ["Đạt", "Long", "Huy"]

        System.out.println(students.size());
        // 3

        System.out.println(students.isEmpty());
        // false

        System.out.println(students.get(0));
        // Đạt

        System.out.println(students.indexOf("Đạt"));
        // 0

        System.out.println(students.contains("Hà"));
        // false

        students.remove(0);
        students.remove("Long");
        // Xóa hết
        students.clear();
    }
}
