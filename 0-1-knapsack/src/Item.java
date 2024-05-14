public class Item {
    private final String name;
    private final int weight;
    private final int profit;

    public Item(String name, int weight, int profit) {
        this.name = name;
        this.weight = weight;
        this.profit = profit;
    }

    public int getWeight() {
        return weight;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", profit=" + profit +
                '}';
    }
}
