package abstraction;

public abstract class Shape {
    // Trong 1 class mà có abstract thì bắt buộc class phải abstract
    // Ngược lại thì không
    public abstract double area();

    public void showInfor(){
        System.out.println("Shape");
    }
}
