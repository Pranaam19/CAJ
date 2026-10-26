package Lab2;


import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = {4, -3, 2, -7, 0, -1, 8, -2};
        System.out.println("Original Array: " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;


        while (left <= right) {
            if (array[left] < 0) {
                left++;
            } else if (array[right] >= 0) {
                right--;
            } else {

                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Rearranged Array: " + Arrays.toString(array));
    }
}

