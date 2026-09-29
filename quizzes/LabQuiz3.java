import javax.swing.JOptionPane;
public class LabQuiz3 {
    /** This code asks the user to input
     * the gross bill of the customer and the
     * amount given by the customer to the waiter.
     * The output will show the customers net bill and change
     */
    public static void main(String[] args) {
        //Shows the welcome message
        String welcome = "Welcome to the XYZ's Pizza Parlor";
        JOptionPane.showMessageDialog(null, welcome);

        //Ask the user to input gross bill
        double grossBill = Double.parseDouble(JOptionPane.showInputDialog("Please Enter the Customer Gross Bill"));

        //Ask the user to input customers pay
        double customerPay = Double.parseDouble(JOptionPane.showInputDialog("Please Enter the Customer Money Gave"));

        if (customerPay < grossBill) {
            //Declares variables for the extra charges
            double serviceCharge = 0.12;
            double salesTax = 0.07;
            double serviceChargeFee = grossBill * serviceCharge, salesTaxFee = grossBill * salesTax;

            //Calculates the net bill and change of the customer
            double netBill = grossBill + serviceChargeFee + salesTaxFee;
            double change = customerPay - netBill;

            String Total =
                    "The Order ========== " + "Php " + grossBill +
                            "\n Service Charge ===== " + "Php " + serviceChargeFee +
                            "\n Sales Tax ========== " + "Php " + salesTaxFee +
                            "\n Net Bill ============ " + "Php " + netBill +
                            "\n Customer's Pay ===== " + "Php " + customerPay +
                            "\n \n Change =========== " + "Php " + change;
            JOptionPane.showMessageDialog(null, Total);
        } else {
            String invalid = "Insufficient Money!";
            JOptionPane.showMessageDialog(null, invalid);
        }
    }
}
