package lab4_3;

public class Square extends Rectangle {



    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color,double side,boolean filled){
        super(color,filled,side,side);
    }

    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side ){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square: Color"+getColor()+"Width"+getWidth()+", Area"+getArea() ;
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }
}
