import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Linear Regression Test
        ArrayList<Double> xal= new ArrayList<>();
        ArrayList<Double> yal= new ArrayList<>();
        xal.add(124.0); xal.add(136.0);
        yal.add(142.0); yal.add(117.0);
        LinearRegression linearRegression = new LinearRegression(xal,yal);
        System.out.println(linearRegression);

        //Standard Deviation Test
        ArrayList<Double> testData = new ArrayList<>();
        testData.add(124.0);
        testData.add(136.0);
        testData.add(142.0);
        testData.add(117.0);
        testData.add(140.0);
        testData.add(138.0);
        testData.add(125.0);
        StandardDeviation test = new StandardDeviation(testData);
        System.out.println(test);
    }

}
