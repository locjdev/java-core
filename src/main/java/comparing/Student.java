package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sắp xếp tăng dần theo id
    @Override
    public int compareTo(Student that) {
        // ASC: Id tăng dần
       return Integer.compare(this.id, that.id);
        // DESC: Id giảm dần
        // return Integer.compare(that.id, this.id);

        // DESC: Name giảm dần
        // return that.name.compareTo(this.name);
    }




    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
