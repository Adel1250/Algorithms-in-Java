public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4};
        binarySearch.setArr(arr);
        System.out.println(binarySearch.search(0, arr.length - 1, 6));
    }
}