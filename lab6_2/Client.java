package lab6_2;

public class Client {
    private static void testAdd(){
        Calculator calc = BasicCalculator.getInstance();
        assert calc.put(100)
                .put(50)
                .add()
                .read() == 150;

        assert calc.put(121)
                    .put(-1)
                    .add()
                .read() == 120;
    }
    private static void testSubtract(){
        Calculator calc = BasicCalculator.getInstance();

    }

    public static void main(String[] args) {
        testAdd();
        testSubtract();
    }
}
