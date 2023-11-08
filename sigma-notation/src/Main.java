public class Main {
    public static void main(String[] args) {
        SigmaNotation sigmaNotation = new SigmaNotation();
        System.out.println("Sigma is " + sigmaNotation.calculateSigmaForExpression(1, 3));
        double[] x = new double[] {1, 2, 3};
        System.out.println("Standard deviation is " + sigmaNotation.standardDeviation(x));
    }
}