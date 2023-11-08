public class SigmaNotation {
    public int calculateSigmaForExpression(int from, int to) {
        int sigma = 0;
        for (int i = from; i <= to; i++) {
            sigma += 2 * i - 1;
        }
        return sigma;
    }

    public double standardDeviation(double[] x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        double mean = sum / x.length;
        double sigma = 0;
        for (double i : x) {
            sigma += Math.pow((i - mean), 2);
        }
        return Math.sqrt(sigma / x.length);
    }
}
