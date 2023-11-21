import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 4};
        MergeSort.mergeSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}