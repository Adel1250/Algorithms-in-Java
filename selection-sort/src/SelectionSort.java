public class SelectionSort {
    private int[] arr;

    public SelectionSort() {
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void selectionSort() {
        for (int i = 0; i < this.arr.length; i++) {
            int minIndex = i;
            for (int j  = i + 1; j < this.arr.length; j++) {
                if (this.arr[j] < this.arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = this.arr[i];
            this.arr[i] = this.arr[minIndex];
            this.arr[minIndex] = temp;
        }
    }
}
