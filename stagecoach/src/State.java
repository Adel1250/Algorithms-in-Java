public class State {
    private final char from;
    private char to;
    private int cost;

    public State(char from) {
        this.from = from;
        this.to = (char) 0;
        this.cost = 0;
    }

    public char getFrom() {
        return from;
    }

    public char getTo() {
        return to;
    }

    public int getCost() {
        return cost;
    }

    public void setTo(char to) {
        this.to = to;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "State{" +
                "from=" + from +
                ", to=" + to +
                ", cost=" + cost +
                '}';
    }
}
