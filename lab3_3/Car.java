package lab3_3;

import java.time.LocalDate;

public class Car {
    private int id;
    private String name;
    private LocalDate yop;
    private String color;
    private int price;

    Car(int id, String name, LocalDate yop, String color, int price) {
        this.id = id;
        this.name = name;
        this.yop = yop;
        this.color = color;
        this.price = price;
    }

    public boolean ifpresent(int id){
        if(this.id == id)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "id"+getId()+"| name"+getName()+"| yop"+getYop()+"| color"+getColor()+"| price"+getPrice();
    }

    public LocalDate getYop() {
        return yop;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYop(LocalDate yop) {
        this.yop = yop;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
