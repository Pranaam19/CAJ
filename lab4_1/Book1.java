package lab4_1;

public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int quantity=0;

    Book1(String name, Author author, int i, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    Book1( String name, Author author, double price,int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book: "+getName()+"\nAuthor: "+getAuthor()+"\nPrice: "+getPrice()+"\nQuantity: "+getQuantity();
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
