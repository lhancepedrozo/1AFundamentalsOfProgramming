import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment1_BufferedReader {
    /** This code asks the user for a year input then
     *  identifies if it is a leap year or not */

    public static void main(String[] args) {
        System.out.println("==========LEAP YEAR IDENTIFIER==========");

        // Declaring a buffered reader for input type
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));

        try {
        // Asks the user to enter a year
        System.out.print("Enter a Year: ");
        String yearInput = inputData.readLine();
        int year = Integer.parseInt(yearInput);

        // Identify if the year is leap year or not
        boolean identify = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (identify) {
            System.out.printf("The year %d is a leap year.", year);
        } else {
            System.out.printf("The year %d is not a leap year.", year);
        }

        } catch (IOException e) {
            System.err.print("Invalid Year");
        }


    }
}
