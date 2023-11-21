public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (right <= left) return;
        int midpoint = (right + left) / 2;
        mergeSort(arr, left, midpoint);
        mergeSort(arr, midpoint + 1, right);
        merge(arr, left, midpoint, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int m = mid - left + 1;
        int n = right - mid;
        int i;
        int j;
        int k = left;
        int[] leftArr = new int[m];
        int[] rightArr = new int[n];

        for (i = 0; i < m; i++) {
            leftArr[i] = arr[left + i];
        }
        for (j = 0; j < n; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;

        while (i < m && j < n) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
