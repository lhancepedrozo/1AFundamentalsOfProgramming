import javax.swing.JOptionPane;
public class Assignment4_JOption {
    /** This code asks the user to input the applicant’s height, age, citizenship code(“C” for citizen of Endor,
     * “N” for non-citizen), and recommendee code (“R” for recommendee, “N” for non-recommendee) and then
     * output whether the applicant is accepted or rejected. */
    public static void main(String[] args) {

        String welcome = "==========EDI KNIGHT MILITARY ACADEMY==========";
        JOptionPane.showMessageDialog(null, welcome);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in cm"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        String codeInput = JOptionPane.showInputDialog("Enter code");
        char code = codeInput.charAt(0);

        if (code == 'R' || code == 'r') {
            String output = "You are accepted!";
            JOptionPane.showMessageDialog(null, output);

        } else if ( code == 'C' || code == 'c'){
            if (height >= 200) {

                if(age >= 21 && age <= 25) {
                    String output = "You are accepted!";
                    JOptionPane.showMessageDialog(null, output);
                } else {
                    String output = "You are rejected!";
                    JOptionPane.showMessageDialog(null, output);
                }

            } else {
                String output = "You are rejected!";
                JOptionPane.showMessageDialog(null, output);
            }
        } else if (code == 'N' || code == 'n') {
            String output = "You are rejected";
            JOptionPane.showMessageDialog(null, output);
        } else {
            String output = "Invalid Code";
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
