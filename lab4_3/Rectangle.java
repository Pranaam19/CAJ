package lab4_3;

public class Rectangle extends Shape{

    private double length=1.0;
    private double width=1.0;

    Rectangle(){
        super();
    }

    Rectangle(double length,double width) {
        super();
        this.length=length;
        this.width=width;
    }
    Rectangle(String color,boolean filled,double length,double width) {
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle: " + "length=" + getLength() + ", width=" + getWidth() + "Color"+getColor()+"Area"+getArea()+"Perimeter"+getPerimeter();
    }
}

