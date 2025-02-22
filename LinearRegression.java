import java.util.HashMap;
public class LinearRegression {
    
    static double sumX, sumY, sumXY, sumXX, mValue, bValue, meanX, meanY = 0.0;
    static int n = 12; 

    public static double calcM(HashMap<Double,Double> values) {
        double sumX = 0.0;
        double sumY = 0.0;
        double sumXY = 0.0;
        double sumXX = 0.0;

        // Sum all x values (temperature)
        for (double key : values.keySet()) {
            sumX += key;
        }

        // Sum all y values (ice cream sales)
        for (double key : values.values()) {
            sumY += key;
        }

        // Multiply x and y values for each data entry and take sum
        for (double key : values.keySet()) {
            double value = values.get(key);
            sumXY += key*value;
        }
        
        // Multiply each x by itself for each data entry and take sum
        for (double key : values.keySet()) {
            sumXX += key*key;
        }
        
        // Find value of M using the formula
        mValue = 0.0;
        n = 12;
        mValue = (n*sumXY - sumY*sumX) / (n*sumXX - sumX*sumX); 
        System.out.println("M-value: " + mValue);

        return mValue;
    }

    public static double calcB(HashMap<Double,Double> values){
        meanX = 0.0;
        meanY = 0.0;
        // Find the mean of x and mean of y values
        for (double key : values.keySet()){
            meanX += key*(1.0/n);
            meanY += (values.get(key))*(1.0/n);
        }

        // Calculate the b-value
        bValue = meanY - (mValue*meanX);
        System.out.println("b-value: " + bValue);
        return bValue; 
    }


}
