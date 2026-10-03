import javax.swing.JOptionPane;
public class Assignment2_3 {
    /** This code asks the user for hourly pay and hours worked and the code computes
     *  the gross pay and identify the withholding tax and computes for net pay. */
    public static void main(String[] args) {
        String welcome = "==========NET PAY CALCULATOR==========";
        JOptionPane.showMessageDialog(null, welcome);

        // Ask the user for input hourly pay and hours worked
        int hourlyPay = Integer.parseInt(JOptionPane.showInputDialog("Enter hourly pay"));
        int hourWork = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked"));

        // Computes the gross pay
        double grossPay = hourlyPay * hourWork;

        // Identifies the withholding tax
        if (grossPay >= 0 && grossPay <= 2000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.10;
            double netPay = grossPay - withholdingTax;

            String output = String.format("You work for %d hours and have a %d hourly pay. " +
                                          "%n%nYou have %.2f Gross Pay. " +
                                          "%nAnd Withholding tax of %.2f." +
                                          "%nTotal Net Pay: %.2f",
                                          hourWork,
                                          hourlyPay,
                                          grossPay,
                                          withholdingTax,
                                          netPay);
            JOptionPane.showMessageDialog(null, output);
        } else if (grossPay >= 2001 && grossPay <= 4000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.12;
            double netPay = grossPay - withholdingTax;

            String output = String.format("You work for %d hours and have a %d hourly pay. " +
                                          "%n%nYou have %.2f Gross Pay. " +
                                          "%nAnd Withholding tax of %.2f." +
                                          "%nTotal Net Pay: %.2f",
                                          hourWork,
                                          hourlyPay,
                                          grossPay,
                                          withholdingTax,
                                          netPay);
            JOptionPane.showMessageDialog(null, output);
        } else if (grossPay >= 4001 && grossPay <= 10000) {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.15;
            double netPay = grossPay - withholdingTax;

            String output = String.format("You work for %d hours and have a %d hourly pay. " +
                                          "%n%nYou have %.2f Gross Pay. " +
                                          "%nAnd Withholding tax of %.2f." +
                                          "%nTotal Net Pay: %.2f",
                                          hourWork,
                                          hourlyPay,
                                          grossPay,
                                          withholdingTax,
                                          netPay);
            JOptionPane.showMessageDialog(null, output);
        } else {
            //Calculates for the net pay
            double withholdingTax = grossPay * 0.10;
            double netPay = grossPay - withholdingTax;

            String output = String.format("You work for %d hours and have a %d hourly pay. " +
                                          "%n%nYou have %.2f Gross Pay. " +
                                          "%nAnd Withholding tax of %.2f." +
                                          "%nTotal Net Pay: %.2f",
                                          hourWork,
                                          hourlyPay,
                                          grossPay,
                                          withholdingTax,
                                          netPay);
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
