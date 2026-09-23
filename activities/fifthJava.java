import java.io.*;
import java.sql.SQLOutput;

public class fifthJava {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read integer
            System.out.print("Enter your age: ");
            String ageInput = dataIn.readLine(); // Read String
            int age = Integer.parseInt(ageInput); // Convert to int

            // Read Double
            System.out.print("Enter your exact height in meters: ");
            String heightInput = dataIn.readLine(); // Read String
            double height = Double.parseDouble(heightInput); // Convert to double
            System.out.print("You are " + age + " years old and " + height + "m tall");

        } catch ( IOException e) {
            // This happens if the user types "Twenty" instead of 20
            System.err.println("Invalid number format! Please enter digits only");

        }
    }
}
