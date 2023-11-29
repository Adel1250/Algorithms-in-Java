public class SegregatePositiveAndNegativeNumbers {
    public static void segregate(int[] arr, int left, int right) {
        if (left == right)
            return;
        int mid = (left + right) / 2;
        segregate(arr, left, mid);
        segregate(arr, mid + 1, right);
        conquer(arr, left, mid, right);
    }

    private static void conquer(int[] arr, int left, int mid, int right) {
        int leftArrLength = mid - left + 1;
        int rightArrLength = right - mid;

        int[] leftArr = new int[leftArrLength];
        int[] rightArr = new int[rightArrLength];

        System.arraycopy(arr, left, leftArr, 0, leftArrLength);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightArrLength);

        int i = 0, j = 0;

        while (i < leftArrLength && j < rightArrLength) {
            if (leftArr[i] > 0 && rightArr[j] < 0) {
                int temp = leftArr[i];
                leftArr[i] = rightArr[j];
                rightArr[j] = temp;
                i++;
                j++;
            } else if (leftArr[i] < 0 && rightArr[j] < 0) {
                i++;
            } else if (leftArr[i] > 0 && rightArr[j] > 0) {
                j++;
            } else {
                i++;
                j++;
            }

            System.arraycopy(leftArr, 0, arr, left, leftArrLength);
            System.arraycopy(rightArr, 0, arr, mid + 1, rightArrLength);
        }
    }
}
