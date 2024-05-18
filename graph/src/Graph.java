import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private final Vertex[] vertices;

    public Graph(String[] names) {
        vertices = new Vertex[names.length];
        for (int i = 0; i < names.length; i++) {
            vertices[i] = new Vertex(names[i]);
        }
    }

    public void addEdges(int vertexIndex, int[] targets) {
        Edge[] vertexLinks = new Edge[targets.length];
        for (int i = 0; i < targets.length; i++) {
            vertexLinks[i] = new Edge(0, vertices[i], vertices[targets[i]]);
        }
        vertices[vertexIndex].setVertexLinks(vertexLinks);
    }

    public void bfs() {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertices[0]);
        vertices[0].setVisited(true);
        System.out.println("BFS Edges:");
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            Edge[] destinations = currentVertex.getVertexLinks();
            for (Edge destination : destinations) {
                Vertex target = destination.getTarget();
                if (target.isNotVisited()) {
                    queue.add(target);
                    target.setVisited(true);
                    destination.setTarget(target);
                    System.out.println(currentVertex.getName() + " - " + target.getName());
                }
            }
            currentVertex.setVertexLinks(destinations);
        }
        restoreVertices();
    }

    public void dfs() {
        System.out.println("DFS Edges:");
        dfsRecursion((vertices[0]));
        restoreVertices();
    }

    private void dfsRecursion(Vertex currentVertex) {
        currentVertex.setVisited(true);
        Edge[] destinations = currentVertex.getVertexLinks();
        for (Edge destination : destinations) {
            Vertex target = destination.getTarget();
            if (target.isNotVisited()) {
                System.out.println(currentVertex.getName() + " - " + target.getName());
                dfsRecursion(target);
            }
        }
    }

    private void restoreVertices() {
        for (Vertex vertex : vertices) {
            vertex.setVisited(false);
        }
    }
}
