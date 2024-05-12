import java.util.List;

public class Path {
    private final List<Character> labels;
    private final int cost;

    public Path(List<Character> labels, int cost) {
        this.labels = labels;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Path{" +
                "labels=" + labels +
                ", cost=" + cost +
                '}';
    }
}
