import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(4, 1),
                new Item(9, 2),
                new Item(12, 10),
                new Item(11, 4),
                new Item(6, 3),
                new Item(5, 5)
        );
        System.out.println(new Knapsack(12, items).fillKnapsack());
    }
}