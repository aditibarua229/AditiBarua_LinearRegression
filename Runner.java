import java.util.HashMap;
public class Runner {
   public static void main(String[] args) {
    // Create a HashMap object called values
    HashMap<Double, Double> values = new HashMap<>();


    // Add keys and values
    values.put(14.2,215.0);
    values.put(16.4,325.0);
    values.put(11.9,185.0);
    values.put(15.2,332.0);
    values.put(18.5,406.0);
    values.put(22.1,522.0);
    values.put(19.4,412.0);
    values.put(25.1,614.0);
    values.put(23.4,544.0);
    values.put(18.1,421.0);
    values.put(22.6, 445.0);
    values.put(17.2,408.0);
   
    // Calling calcM and calcB methods
    LinearRegression.calcM(values);
    LinearRegression.calcB(values);
  }
}
