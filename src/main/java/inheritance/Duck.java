package inheritance;

public class Duck extends Animal {
    // dùng lệnh extends để Duck đang kế thừa Animal

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Duck is eating...");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
