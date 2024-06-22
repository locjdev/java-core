package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer(10);

        // inner class (Không có static)
        Outer.Inner inner = outer.new Inner();
        inner.showInfor();

        // nested class (Có static)
        Outer.Nested nested = new Outer.Nested();
        nested.showInfor();

        // local class: Class bên trong 1 method, chỉ có thể sử dụng được trong hàm đó thôi.
        demo();
    }

    public static void demo() {
        class Dog {
            private int age;

            @Override
            public String toString() {
                return "Dog{" +
                        "age=" + age +
                        '}';
            }

            public Dog(int age) {
                this.age = age;
            }
        }
        Dog dog = new Dog(2);
        System.out.println("dog = " + dog);
    }
}
