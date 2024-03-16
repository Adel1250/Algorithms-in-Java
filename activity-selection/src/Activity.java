public record Activity(int startTime, int endTime) {

    @Override
    public String toString() {
        return "Activity{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
