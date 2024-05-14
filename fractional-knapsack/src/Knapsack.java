import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Knapsack {
    private int availableCapacity;
    private final List<Item> availableItemsList;
    private final List<Item> filledItemsList;
    private double profit;

    public Knapsack(int maximumCapacity, List<Item> availableItemsList) {
        this.availableItemsList = availableItemsList;
        this.availableCapacity = maximumCapacity;
        this.filledItemsList = new ArrayList<>();
        this.profit = 0;
    }

    public Knapsack fillKnapsack() {
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
            filledItemsList.add(new Item(itemProfit, allowedItemWeight));
            if (availableCapacity == 0) {
                break;
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return "Knapsack{" +
                "filledItemsList=" + filledItemsList +
                ", profit=" + profit +
                '}';
    }
}
