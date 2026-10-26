package Lab2;


public class FloydTriangle {
    public static void main(String[] args) {
        int number = 1;
        int limit = 91;
        int row = 1;

        while (number <= limit) {

            for (int col = 1; col <= row && number <= limit; col++) {
                System.out.print(number + "\t");
                number++;
            }
            System.out.println();
            row++;
        }
    }
}
