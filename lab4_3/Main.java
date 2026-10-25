package lab4_3;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square();
        assert(s1.isFilled());
        assert(s1.getColor().equals("red"));


        Square s2 = new Square("red",6,true);
        assert(s2.isFilled());
        assert(s2.getColor().equals("red"));
        assert(s2.getSide()==6);
        Square s3 = new Square("blue",8,false);
        assert(s3.isFilled() == false);
        s2.setColor("Green");
        s2.setSide(8);
        assert(s2.getArea()==64);

        assert(s2.getArea()==64);
        Circle c1 = new Circle(1);
        assert(c1.getColor().equals("red"));
        c1.getArea();
        assert(c1.getArea()==452);
        Rectangle r1 = new Rectangle(12,12);
        assert(r1.getColor().equals("red"));
        r1.getArea();
        assert(r1.getArea()==142);





    }
}
