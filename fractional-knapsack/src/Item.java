public class Item {
    private final int profit;
    private int weight;
    private final double ratio;

    public Item(int profit, int weight) {
        if (weight == 0) {
            throw new IllegalArgumentException("Weight can't be zero");
        }
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double) profit / weight;
    }

    public int getProfit() {
        return profit;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRatio() {
        return ratio;
    }
}
