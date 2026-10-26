package Lab1;

public class SumArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide at least 3 numeric arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double num3 = Double.parseDouble(args[2]);

            double sum = num1 + num2 + num3;
            System.out.println("Sum of the three numbers: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: All 3 arguments must be valid numbers.");
        }
    }
}


