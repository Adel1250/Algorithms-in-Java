import java.util.Comparator;
import java.util.List;

public class Knapsack {
    private int availableCapacity;
    private final List<Item> availableItemsList;
    private double profit;

    public Knapsack(int maximumCapacity, List<Item> availableItemsList) {
        this.availableItemsList = availableItemsList;
        this.availableCapacity = maximumCapacity;
        this.profit = 0;
    }

    public double fillKnapsack() {
        List<Item> sortedAvailableItems = availableItemsList.stream().sorted(Comparator.comparingDouble(Item::getRatio).reversed()).toList();
        for (Item item : sortedAvailableItems) {
            int allowedItemWeight = item.getWeight();
            double itemProfit = item.getProfit();
            if (item.getWeight() > availableCapacity) {
                allowedItemWeight = availableCapacity;
                itemProfit = item.getRatio() * allowedItemWeight;
            }
            profit += itemProfit;
            availableCapacity -= allowedItemWeight;
            if (availableCapacity == 0) {
                break;
            }
        }
        return profit;
    }
}
