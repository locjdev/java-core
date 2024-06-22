package comparing;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student(7, "Huy7"));
        students.add(new Student(2, "Huy2"));
        students.add(new Student(4, "Huy4"));
        students.add(new Student(1, "Huy1"));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("iterator" + student);
        }
    }
}
