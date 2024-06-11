package entity;

public class Dog {
    public String name;
    protected int age;
    String color;
    private int id;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
