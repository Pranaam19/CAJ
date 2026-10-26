package Lab2;


public class FloydTriangleBinary {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            int val = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");

                val = 1 - val;
            }
            System.out.println();
        }
    }
}

