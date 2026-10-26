package lab5_1;


public class Rectangle implements IShape {
    private double _height;
    private double _width;

    public Rectangle(double height, double width) {
        this._height = height;
        this._width = width;
    }

    public double getHeight() {
        return _height;
    }

    public double getWidth() {
        return _width;
    }

    @Override
    public double getArea() {
        return _height * _width;
    }

    @Override
    public String toString() {
        return "Rectangle [Height=" + _height + ", Width=" + _width + ", Area=" + String.format("%.2f", getArea()) + "]";
    }
}
