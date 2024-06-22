package generic;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return java.lang.Math.pow(radius, 2) * java.lang.Math.PI;
    }
}
