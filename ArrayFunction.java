import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 5};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 7);
        System.out.println("Index of 7: " + index);
    }
}
