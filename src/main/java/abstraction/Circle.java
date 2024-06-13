package abstraction;

public class Circle extends Shape implements Drawable, Extendable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void extend() {
        System.out.println("Extend Circle");
    }
}
