package lab5_1;

import static java.lang.Math.round;

public class Circle extends Shape {
        private int radius =1;

        public Circle(){
            super();
        }

        public Circle(int radius){
            super();
            this.radius = radius;
        }
        public Circle(int radius,String color, boolean filled){
            super(color,filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double getArea(){
            return radius * radius * Math.PI;
        }
        public double getPerimeter(){
            return round(radius * 2 * Math.PI);
        }

    @Override
    public String toString() {
        return "Circle: Color"+getColor()+", Radius"+getRadius()+", Area"+getArea()+", Perimeter"+getPerimeter();
    }
}
