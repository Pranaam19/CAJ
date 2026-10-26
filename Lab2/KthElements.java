package Lab2;


import java.util.Arrays;

public class KthElements {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19, 1, 26};
        int k = 3; // Find the 3rd smallest and 3rd largest

        if (k > array.length || k <= 0) {
            System.out.println("Invalid value of k");
            return;
        }

        Arrays.sort(array);

        int kthSmallest = array[k - 1];
        int kthLargest = array[array.length - k];

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println(k + "rd Smallest element: " + kthSmallest);
        System.out.println(k + "rd Largest element: " + kthLargest);
    }
}
