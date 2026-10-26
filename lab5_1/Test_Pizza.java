package lab5_1;

public class Test_Pizza {
    public static void main(String[] args) {
        System.out.println("--- Running Pizza Test Cases ---\n");


        System.out.println("[Test Case 1: Circular Pizza Validation]");
        IShape circularShape = new Circle(6.0); // Radius = 6 inches
        Pizza roundPizza = new Pizza(14.99, circularShape);

        roundPizza.displayPizzaDetails();

        System.out.println("Verification -> Price match: " + (roundPizza.getPrice() == 14.99));
        System.out.println("Verification -> Shape instance: " + (roundPizza.getShape() instanceof Circle));
        System.out.println("Verification -> Calculated Area: " + String.format("%.2f", roundPizza.getShape().getArea()) + " sq inches\n");

        System.out.println("[Test Case 2: Rectangular Pizza Validation]");
        IShape rectangularShape = new Rectangle(10.0, 12.0); // Height = 10, Width = 12
        Pizza squarePizza = new Pizza(19.99, rectangularShape);

        squarePizza.displayPizzaDetails();

        System.out.println("Verification -> Price match: " + (squarePizza.getPrice() == 19.99));
        System.out.println("Verification -> Shape instance: " + (squarePizza.getShape() instanceof Rectangle));
        System.out.println("Verification -> Calculated Area: " + squarePizza.getShape().getArea() + " sq inches\n");
    }
}
