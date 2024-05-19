public class Main {
    public static void main(String[] args) {
        Graph g1 = new Graph(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"});
        g1.addEdges(0, new int[]{1, 2});
        g1.addEdges(1, new int[]{0, 3, 4});
        g1.addEdges(2, new int[]{0, 3, 5});
        g1.addEdges(3, new int[]{1, 2, 4});
        g1.addEdges(4, new int[]{1, 5});
        g1.addEdges(5, new int[]{2, 3, 4, 7});
        g1.addEdges(6, new int[]{7, 8});
        g1.addEdges(7, new int[]{5, 6, 8});
        g1.addEdges(8, new int[]{6, 7});
        g1.bfs();
        g1.dfs();

        Graph g2 = new Graph(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
        g2.addEdges(0, new int[]{1, 2, 3}, new double[]{2, 4, 3});
        g2.addEdges(1, new int[]{4, 5, 6}, new double[]{7, 4, 6});
        g2.addEdges(2, new int[]{4, 5, 6}, new double[]{3, 2, 4});
        g2.addEdges(3, new int[]{4, 5, 6}, new double[]{4, 1, 5});
        g2.addEdges(4, new int[]{7, 8}, new double[]{1, 4});
        g2.addEdges(5, new int[]{7, 8}, new double[]{6, 3});
        g2.addEdges(6, new int[]{7, 8}, new double[]{3, 3});
        g2.addEdges(7, new int[]{9}, new double[]{3});
        g2.addEdges(8, new int[]{9}, new double[]{4});
        g2.dijkstra();
    }
}