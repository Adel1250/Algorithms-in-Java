public class BinarySearch {
    private int[] arr;

    public BinarySearch() {
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
        } else if (target < this.arr[middle]) {
            return search(left, middle - 1, target);
        } else {
            return search(middle + 1, right, target);
        }
    }

    public Integer searchIterative(Integer target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
        return null;
    }
}
