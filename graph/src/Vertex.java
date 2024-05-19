import java.util.Arrays;

public class Vertex {
    private final String name;
    private boolean visited;
    private double totalLength;
    private Vertex sourceOfTotalLength;
    private Edge[] vertexLinks;

    public Vertex(String name) {
        this.name = name;
        this.visited = false;
        this.totalLength = 0;
        this.sourceOfTotalLength = null;
    }

    public Edge[] getVertexLinks() {
        return vertexLinks;
    }

    public String getName() {
        return name;
    }

    public boolean isNotVisited() {
        return !visited;
    }

    public void setVertexLinks(Edge[] vertexLinks) {
        this.vertexLinks = vertexLinks;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(double totalLength) {
        this.totalLength = totalLength;
    }

    public Vertex getSourceOfTotalLength() {
        return sourceOfTotalLength;
    }

    public void setSourceOfTotalLength(Vertex sourceOfTotalLength) {
        this.sourceOfTotalLength = sourceOfTotalLength;
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
