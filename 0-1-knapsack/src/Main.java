import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("#1", 1, 4));
        items.add(new Item("#2", 3, 9));
        items.add(new Item("#3", 5, 12));
        items.add(new Item("#4", 4, 11));

        System.out.println(new Knapsack(8, items).getKnapsack());
    }
}