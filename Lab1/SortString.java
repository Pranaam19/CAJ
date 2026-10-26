package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find length
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Sort alphabetically
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        System.out.println("Alphabetically sorted string: " + sortedString);
        scanner.close();
    }
}
