import java.util.ArrayList;
import java.util.List;

public class Stagecoach {
    private final char[] labels;
    private final int[][] data;

    public Stagecoach(char[] labels, int[][] data) {
        this.labels = labels;
        this.data = data;
    }

    public State[] setStates() {
        int n = data.length;
        State[] states = new State[n];
        states[n - 1] = new State(labels[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            int cost = Integer.MAX_VALUE;
            char to = (char) 0;
            for (int j = i + 1; j < n; j++) {
                if (data[i][j] == 0)
                    continue;
                if (data[i][j] + states[j].getCost() < cost) {
                    cost = data[i][j] + states[j].getCost();
                    to = labels[j];
                }
            }
            states[i] = new State(labels[i]);
            states[i].setCost(cost);
            states[i].setTo(to);
        }
        return states;
    }

    public Path getOptimalPath() {
        State[] states = setStates();
        List<Character> pathLabels = new ArrayList<>();
        pathLabels.add(states[0].getFrom());
        pathLabels.add(states[0].getTo());
        char to = states[0].getTo();
        int cost = states[0].getCost();
        for (int i = 1; i < states.length - 1; i++) {
            if (states[i].getFrom() == to) {
                pathLabels.add(states[i].getTo());
                to = states[i].getTo();
            }
        }
        return new Path(pathLabels, cost);
    }
}
