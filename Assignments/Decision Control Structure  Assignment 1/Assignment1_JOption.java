import javax.swing.JOptionPane;
public class Assignment1_JOption {
    /** This code asks the user for a year
     *  input then identifies if it is a
     *  leap year or not */
    public static void main(String[] args) {

        String welcome = "==========LEAP YEAR IDENTIFIER==========";
        JOptionPane.showMessageDialog(null, welcome);

        // Ask the user for input year
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a Year"));

        // Identify if the year is leap year or not
        boolean identify = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (identify) {
            String output = String.format("The year %d is a leap year.", year);
            JOptionPane.showMessageDialog(null, output);
        } else {
            String output = String.format("The year %d is not a leap year.", year);
            JOptionPane.showMessageDialog(null, output);
        }

    }
}
