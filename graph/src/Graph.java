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
            vertexLinks[i] = new Edge(0, vertices[targets[i]]);
        }
        vertices[vertexIndex].setVertexLinks(vertexLinks);
    }

    public void addEdges(int vertexIndex, int[] targets, double[] weights) {
        Edge[] vertexLinks = new Edge[targets.length];
        for (int i = 0; i < targets.length; i++) {
            vertexLinks[i] = new Edge(weights[i], vertices[targets[i]]);
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

    public void dijkstra() {
        System.out.println("Dijkstra:");
        for (int i = 1; i < vertices.length; i++) {
            vertices[i].setTotalLength(Double.MAX_VALUE);
        }
        for (Vertex vertex : vertices) {
            if (vertex.getVertexLinks() == null)
                continue;
            for (Edge edge : vertex.getVertexLinks()) {
                double newLength = edge.getWeight() + vertex.getTotalLength();
                if (newLength < edge.getTarget().getTotalLength()) {
                    Vertex target = edge.getTarget();
                    target.setSourceOfTotalLength(vertex);
                    target.setTotalLength(newLength);
                    edge.setTarget(target);
                }
            }
        }

        // Path Traversal
        StringBuilder path = new StringBuilder(vertices[vertices.length - 1].getName());
        Vertex v = vertices[vertices.length - 1];
        while (v.getSourceOfTotalLength() != null) {
            path.insert(0, v.getSourceOfTotalLength().getName() + " - ");
            v = v.getSourceOfTotalLength();
        }
        System.out.println("Path: " + path);
        System.out.println("Total Length: " + vertices[vertices.length - 1].getTotalLength());
        restoreVertices();
    }

    private void restoreVertices() {
        for (Vertex vertex : vertices) {
            vertex.setVisited(false);
            vertex.setTotalLength(0);
            vertex.setSourceOfTotalLength(null);
        }
    }
}
