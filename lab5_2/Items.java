package lab5_2;

public abstract class Items {
    public String Title ;
    public double price;

    public Items(){

    }
    public Items(String title,double price){
        this.Title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return Title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Price: " + getPrice();
    }
}
