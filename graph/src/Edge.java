public class Edge {
    private final double weight;
    private final Vertex source;
    private Vertex target;

    public Edge(double weight, Vertex source, Vertex target) {
        this.weight = weight;
        this.source = source;
        this.target = target;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", source=" + source +
                ", destination=" + target +
                '}';
    }
}
