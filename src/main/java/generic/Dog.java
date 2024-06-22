package generic;

// Giới hạn lại T chỉ có thể là Number
public class Dog<T extends Number> {
    private String name;
    private T age;

    public Dog(String name, T age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
