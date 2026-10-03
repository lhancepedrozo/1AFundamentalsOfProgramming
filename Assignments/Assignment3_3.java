import javax.swing.JOptionPane;
public class Assignment3_3 {
    /** This code asks the user to input parents salary, NSAT score, and entrance exam score
     * and then identify if he/she is accepted, rejected, or need further study. */
    public static void main(String[] args) {
        String welcome = "==========ELIGIBLE SCHOLAR IDENTIFIER==========";
        JOptionPane.showMessageDialog(null, welcome);

        // Ask the user for parents monthly salary, NSAT score, and Entrance Exam Score
        double monthlySalary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents monthly salary"));
        double nsatScore = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score"));
        double etScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Entrance Exam score"));


        // Identifies if he/she is eligible
        if (monthlySalary < 0) {
            String output = "Invalid Salary";
            JOptionPane.showMessageDialog(null, output);
        } else if (monthlySalary >= 0 && monthlySalary <= 3500) {

            if (nsatScore >= 91) {

                if (etScore >= 91) {
                    String output = "You are eligible for the scholarship!";
                    JOptionPane.showMessageDialog(null, output);
                } else if (etScore >= 85 && etScore <= 90) {
                    String output = "You are under further study based on situation!";
                    JOptionPane.showMessageDialog(null, output);
                } else if (etScore < 85) {
                    String output = "You are not eligible for the scholarship!";
                    JOptionPane.showMessageDialog(null, output);
                }

            } else if (nsatScore == 90) {
                String output = "You are under further study based on situation!";
                JOptionPane.showMessageDialog(null, output);
            } else if (nsatScore < 90){
                String output = "You are not eligible for the scholarship!";
                JOptionPane.showMessageDialog(null, output);
            }

        }else if (monthlySalary >= 3501 && monthlySalary <= 10000) {

            if (nsatScore >= 90) {

                if (etScore >= 85 && etScore <= 90) {
                    String output = "You are under further study based on situation!";
                    JOptionPane.showMessageDialog(null, output);
                } else if (etScore < 85) {
                    String output = "You are not eligible for the scholarship!";
                    JOptionPane.showMessageDialog(null, output);
                }

            } else if (nsatScore < 90){
                String output = "You are not eligible for the scholarship!";
                JOptionPane.showMessageDialog(null, output);
            }

        } else if (monthlySalary > 10000) {
            String output = "You are not eligible for the scholarship!";
            JOptionPane.showMessageDialog(null, output);
        }

    }
}
