import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private final int capacity;
    private final List<Item> availableItems;
    private final List<Item> filledItems;
    private int profit;

    public Knapsack(int capacity, List<Item> availableItems) {
        availableItems.add(0, new Item("#0", 0, 0));
        this.capacity = capacity;
        this.availableItems = availableItems;
        filledItems = new ArrayList<>();
        profit = 0;
    }

    private int[][] constructTable() {
        int n = availableItems.size() - 1;
        int[][] table = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            int itemWeight = availableItems.get(i).getWeight();
            int itemProfit = availableItems.get(i).getProfit();
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (itemWeight <= j) {
                    table[i][j] = Math.max(table[i - 1][j], itemProfit + table[i - 1][j - itemWeight]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        return table;
    }

    public Knapsack getKnapsack() {
        int[][] table = constructTable();
        profit = table[availableItems.size() - 1][capacity];
        int remainingWeight = capacity;
        int i = availableItems.size() - 1;
        while (remainingWeight > 0 && i >= 1) {
            if (table[i][remainingWeight] > table[i - 1][remainingWeight]) {
                filledItems.add(availableItems.get(i));
                remainingWeight -= availableItems.get(i).getWeight();
            }
            i--;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "filledItems=" + filledItems +
                ", profit=" + profit +
                '}';
    }
}
