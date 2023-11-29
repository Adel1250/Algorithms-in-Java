import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, -1, -2, 3};

        SegregatePositiveAndNegativeNumbers.segregate(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
}