import java.util.Scanner;
public class Assignment1_Scanner {
    /** This code asks the user for a year
     *  input then identifies if it is a
     *  leap year or not */
    public static void main(String[] args) {
        System.out.println("==========LEAP YEAR IDENTIFIER==========");

        // Declaring Scanner as input type
        Scanner input = new Scanner(System.in);

        // Ask the user for year
        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        // Identify if the year is leap year or not
        int identify = year % 4;
        if (identify == 0) {
            System.out.printf("The year %d is a leap year.", year);
        } else {
            System.out.printf("The year %d is not a leap year.", year);
        }


    }
}
