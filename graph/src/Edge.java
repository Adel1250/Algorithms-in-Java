public class Edge {
    private final double weight;
    private Vertex target;

    public Edge(double weight, Vertex target) {
        this.weight = weight;
        this.target = target;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }
}
