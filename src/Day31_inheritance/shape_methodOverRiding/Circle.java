package Day31_inheritance.shape_methodOverRiding;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double Perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        super.draw();

    }
}
