import java.util.Arrays;

public class Vertex {
    private final String name;
    private boolean visited;
    private Edge[] vertexLinks;

    public Vertex(String name) {
        this.name = name;
        this.visited = false;
    }

    public Edge[] getVertexLinks() {
        return vertexLinks;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVertexLinks(Edge[] vertexLinks) {
        this.vertexLinks = vertexLinks;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", visited=" + visited +
                ", vertexLinks=" + Arrays.toString(vertexLinks) +
                '}';
    }
}
