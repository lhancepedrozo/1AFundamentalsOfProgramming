import java.util.Scanner;

public class Assignment2_2 {
    /** This code asks the user for hourly pay and hours worked and the code computes
     *  the gross pay and identify the withholding tax and computes for net pay. */
    public static void main(String[] args) {
        System.out.println("==========NET PAY CALCULATOR==========");

        // Declaring Scanner as type of input
        Scanner input = new Scanner(System.in);

        // Asks the user for hourly pay input
        System.out.print("Enter hourly pay: ");
        int hourlyPay = input.nextInt();

        // Asks the user for hours worked
        System.out.print("Enter hours worked: ");
        int hourWork = input.nextInt();

        // Computes the gross pay
        double grossPay = hourlyPay * hourWork;

        // Identifies the withholding tax
        if (grossPay >= 0 && grossPay <= 2000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.10;
            double netPay = grossPay - withholdingTax;

            System.out.printf("You work for %d hours and have a %d hourly pay. " +
                              "%n%nYou have %.2f Gross Pay. " +
                              "%nAnd Withholding tax of %.2f." +
                              "%nTotal Net Pay: %.2f",
                              hourWork,
                              hourlyPay,
                              grossPay,
                              withholdingTax,
                              netPay);
        } else if (grossPay >= 2001 && grossPay <= 4000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.12;
            double netPay = grossPay - withholdingTax;

            System.out.printf("You work for %d hours and have a %d hourly pay. " +
                              "%n%nYou have %.2f Gross Pay. " +
                              "%nAnd Withholding tax of %.2f." +
                              "%nTotal Net Pay: %.2f",
                              hourWork,
                              hourlyPay,
                              grossPay,
                              withholdingTax,
                              netPay);
        } else if (grossPay >= 4001 && grossPay <= 10000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.15;
            double netPay = grossPay - withholdingTax;

            System.out.printf("You work for %d hours and have a %d hourly pay. " +
                              "%n%nYou have %.2f Gross Pay. " +
                              "%nAnd Withholding tax of %.2f." +
                              "%nTotal Net Pay: %.2f",
                              hourWork,
                              hourlyPay,
                              grossPay,
                              withholdingTax,
                              netPay);
        } else {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.10;
            double netPay = grossPay - withholdingTax;

            System.out.printf("You work for %d hours and have a %d hourly pay. " +
                              "%n%nYou have %.2f Gross Pay. " +
                              "%nAnd Withholding tax of %.2f." +
                              "%nTotal Net Pay: %.2f",
                              hourWork,
                              hourlyPay,
                              grossPay,
                              withholdingTax,
                              netPay);
        }
    }
}