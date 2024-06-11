import entity.Dog;

public class AcessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
        // Có thể điền ở class, thuộc tính, phương thức
        // public: mọi nơi

        Dog dog1 = new Dog("Long",1);
        System.out.println("dog1 = " + dog1);

        // protected: trong cùng 1 package hoặc class con
        // System.out.println(dog1.age); Lôi gì age là protected

        // default (Kh để gì cả): cùng package
        // System.out.println(dog1.color); Lôi vì color là default

        // private: cùng class
        // System.out.println(dog1.id); Lỗi vì color là private
    }
}
