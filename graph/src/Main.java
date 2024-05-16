public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"});
        g.addEdges(0, new int[] { 1, 2 });
        g.addEdges(1, new int[] { 0, 3, 4 });
        g.addEdges(2, new int[] { 0, 3, 5 });
        g.addEdges(3, new int[] { 1, 2, 4 });
        g.addEdges(4, new int[] { 1, 5 });
        g.addEdges(5, new int[] { 2, 3, 4, 7 });
        g.addEdges(6, new int[] { 7, 8 });
        g.addEdges(7, new int[] { 5, 6, 8 });
        g.addEdges(8, new int[] { 6, 7 });
        g.bfs();
    }
}