import java.util.ArrayList;

public class StandardDeviation {

    private final Double standardDeviation, meanStandardDeviation, mean, variance;
    public StandardDeviation(ArrayList<Double> myData){
        double sum = 0.0;
        for (double i : myData) {
            sum += i;
        }
        double length = myData.size();
        mean = sum / length;
        double standardSum = 0.0;
        for (Double num : myData) {
            standardSum += Math.pow(num - mean, 2);
        }
        standardDeviation = Math.sqrt(standardSum / (length-1));
        meanStandardDeviation = standardDeviation / Math.sqrt(length);
        variance = Math.pow(standardDeviation, 2);

    }
    public Double meanStandardDeviation() {
        return meanStandardDeviation;
    }
    public Double standardDeviation() {
        return standardDeviation;
    }
    public Double variance() {
        return variance;
    }
    public Double mean() {
        return mean;
    }

    @Override
    public String toString() {
        return String.format("Result = %.5f" +
                        " +- %.5f" + "\nStandard Deviation = %.5f" +
                        "\nStandard Deviation of the Mean= %.5f" +
                        "\nVariance = %.5f" +
                        "\nMean = %.5f",
                standardDeviation(), meanStandardDeviation(),
                standardDeviation(),
                meanStandardDeviation(),
                variance(),
                mean());
    }
}
