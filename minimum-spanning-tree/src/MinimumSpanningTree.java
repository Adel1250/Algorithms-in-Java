public class MinimumSpanningTree {
    private final char[] labels;
    private final double[][] graph;

    public MinimumSpanningTree(char[] labels, double[][] graph) {
        this.labels = labels;
        this.graph = graph;
    }

    public void getMinimumSpanningTree() {
        int numberOfVertices = labels.length;
        double totalCost = 0;
        boolean[] selected = new boolean[numberOfVertices];
        int edgesCount = 0;
        selected[0] = true;
        System.out.println("Edges:");
        while (edgesCount < numberOfVertices - 1) {
            double minEdgeWeight = Double.MAX_VALUE;
            int from = -1;
            int to = -1;
            for (int i = 0; i < numberOfVertices; i++) {
                if (selected[i]) {
                    for (int j = 0; j < numberOfVertices; j++) {
                        if (!selected[j] && graph[i][j] != 0 && graph[i][j] < minEdgeWeight) {
                            minEdgeWeight = graph[i][j];
                            from = i;
                            to = j;
                        }
                    }
                }
            }
            selected[to] = true;
            edgesCount++;
            totalCost += minEdgeWeight;
            System.out.println(labels[from] + " - " + labels[to] + ", " + minEdgeWeight);
        }
        System.out.println("Total cost: " + totalCost);
    }
}
