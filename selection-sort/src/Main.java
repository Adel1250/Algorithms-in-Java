import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {3, 4, 2, 0};
        selectionSort.setArr(arr);
        selectionSort.selectionSort();
        System.out.println(Arrays.toString(selectionSort.getArr()));
    }
}