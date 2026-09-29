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

        //Declares variables for the extra charges
        double serviceCharge = 0.12;
        double salesTax = 0.07;
        double serviceChargeFee = grossBill * serviceCharge, salesTaxFee = grossBill * salesTax;

        //Calculates the net bill and change of the customer
        double netBill = grossBill + serviceChargeFee + salesTaxFee;

        //Checks if the money is enough
        while (customerPay < netBill) {
            JOptionPane.showMessageDialog(null, "Insufficient payment!");

            customerPay = Double.parseDouble(JOptionPane.showInputDialog("Bill: ₱" + netBill + "\nEnter payment again:"));
        }

        double change = customerPay - netBill;

        String total = String.format(
                "The Order ========== Php %.2f" +
                        "\n Service Charge ===== Php %.2f" +
                        "\n Sales Tax ========== Php %.2f" +
                        "\n Net Bill ============ Php %.2f" +
                        "\n Customer's Pay ===== Php %.2f" +
                        "\n\n Change =========== Php %.2f",
                grossBill,
                serviceChargeFee,
                salesTaxFee,
                netBill,
                customerPay,
                change
        );
        JOptionPane.showMessageDialog(null, total);


    }
}
