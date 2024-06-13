package polymorphism;

public class PolymorphismDemo {
    // Tính đa hình (ép kiểu)
    // Student --> Person (Kế thừa)
    public static void main(String[] args) {
        Student student = new Student("Huy", 24);
        student.run();

        //Person person = (Person) student;
        Person person = student;
        person.run();

        // instanceof
        Boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);


    }
}
