package staticDemo;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(int id, String name) {
        count++;
        this.id = id;
        this.name = name;
    }

    public Student(String name) {
        if (count>=5)
            throw new IllegalStateException("Tối đa 5 học sinh");
        this.id = ++count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "statics.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
