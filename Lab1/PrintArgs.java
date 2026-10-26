package Lab1;


public class PrintArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide at least 3 command line arguments.");
            return;
        }

        System.out.println("Argument 1: " + args[0]);
        System.out.println("Argument 2: " + args[1]);
        System.out.println("Argument 3: " + args[2]);
    }
}

