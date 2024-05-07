public class HeapNode {
    private final char data;
    private final int freq;
    private HeapNode left;
    private HeapNode right;

    public HeapNode(char data, int freq) {
        this.data = data;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }

    public void setLeft(HeapNode left) {
        this.left = left;
    }

    public void setRight(HeapNode right) {
        this.right = right;
    }

    public int getFreq() {
        return freq;
    }

    public char getData() {
        return data;
    }

    public HeapNode getLeft() {
        return left;
    }

    public HeapNode getRight() {
        return right;
    }
}
