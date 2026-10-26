package Lab2;


import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 7, 8, 2, 3, 1, 4};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Duplicate values: " + duplicates);
    }
}

