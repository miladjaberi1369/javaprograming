package Day38_exception.shapeTask;

public class Circle {

    private double Radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new InvalidShapeException("Radius of circle can not be negative or zero: "+ radius);
        }
        Radius = radius;
    }
}
