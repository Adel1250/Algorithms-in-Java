public class Item {
    private final double profit;
    private final int weight;
    private final double ratio;

    public Item(double profit, int weight) {
        if (weight == 0) {
            throw new IllegalArgumentException("Weight can't be zero");
        }
        this.profit = profit;
        this.weight = weight;
        this.ratio = profit / weight;
    }

    public double getProfit() {
        return profit;
    }

    public int getWeight() {
        return weight;
    }

    public double getRatio() {
        return ratio;
    }

    @Override
    public String toString() {
        return "Item{" +
                "profit=" + profit +
                ", weight=" + weight +
                '}';
    }
}
