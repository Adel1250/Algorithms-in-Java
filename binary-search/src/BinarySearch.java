public class BinarySearch {
    private int[] arr;

    public BinarySearch() {
    }

    public BinarySearch(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Integer search(int left, int right, int target) {
        int middle = (left + right) / 2;
        if (left == right) {
            return null;
        }
        if (target == this.arr[middle]) {
            return middle;
        }
        else if (target < this.arr[middle]) {
            return search(left, middle - 1, target);
        }
        else {
            return search(middle + 1, right, target);
        }
    }
}
