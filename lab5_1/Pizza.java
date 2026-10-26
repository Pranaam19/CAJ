package lab5_1;

public class Pizza {
    private double _price;
    private IShape _shape;

    public Pizza(double price, IShape shape) {
        this._price = price;
        this._shape = shape;
    }

    public double getPrice() {
        return _price;
    }

    public IShape getShape() {
        return _shape;
    }

    public void displayPizzaDetails() {
        System.out.println("Pizza Details:");
        System.out.println("  Price: $" + _price);
        System.out.println("  Shape Profile: " + _shape.toString());
    }
}

