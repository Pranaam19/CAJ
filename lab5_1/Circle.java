package lab5_1;

public class Circle implements IShape {
    private double _radius;

    public Circle(double radius) {
        this._radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    @Override
    public double getArea() {
        return Math.PI * _radius * _radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius=" + _radius + ", Area=" + String.format("%.2f", getArea()) + "]";
    }
}

