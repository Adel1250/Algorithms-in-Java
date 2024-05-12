import java.util.Comparator;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class Huffman {
    char internalChar = (char) 0;
    public Hashtable<Character, String> codes = new Hashtable<>();

    public Huffman(String message) {
        Hashtable<Character, Integer> freqHash = new Hashtable<>();
        for (int i = 0; i < message.length(); i++) {
            Character key = message.charAt(i);
            if (freqHash.containsKey(key)) {
                Integer value = freqHash.get(key);
                freqHash.put(key, ++value);
            } else {
                freqHash.put(key, 1);
            }
        }
        PriorityQueue<HeapNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(HeapNode::getFreq));
        for (Character key : freqHash.keySet()) {
            HeapNode newNode = new HeapNode(key, freqHash.get(key));
            minHeap.add(newNode);
        }
        while (minHeap.size() != 1) {
            HeapNode node1 = minHeap.poll();
            HeapNode node2 = minHeap.poll();
            HeapNode newNode = new HeapNode(internalChar, (((node1 == null) ? 0 : node1.getFreq()) + ((node2 == null) ? 0 : node2.getFreq())));
            newNode.setLeft(node1);
            newNode.setRight(node2);
            minHeap.add(newNode);
        }
        generateCodes(minHeap.peek(), "");
    }

    private void generateCodes(HeapNode node, String str) {
        if (node == null) {
            return;
        }
        char data = node.getData();
        if (data != internalChar) {
            codes.put(data, str);
        }
        generateCodes(node.getLeft(), str + "0");
        generateCodes(node.getRight(), str + "1");
    }
}
