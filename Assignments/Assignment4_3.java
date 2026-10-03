import javax.swing.JOptionPane;
public class Assignment4_3 {
    /** This code asks the user to input the applicant’s height, age, citizenship code(“C” for citizen of Endor,
     * “N” for non-citizen), and recommendee code (“R” for recommendee, “N” for non-recommendee) and then
     * output whether the applicant is accepted or rejected. */
    public static void main(String[] args) {

        String welcome = "==========EDI KNIGHT MILITARY ACADEMY==========";
        JOptionPane.showMessageDialog(null, welcome);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in cm"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        String recomendeeInput = JOptionPane.showInputDialog("Enter recomendee code");
        char recomendee = recomendeeInput.charAt(0);

        if (height >= 200) {

            if(age >= 21 && age <= 25) {

                if (recomendee == 'R' || recomendee == 'r') {
                    String output = "You are accepted!";
                    JOptionPane.showMessageDialog(null, output);
                } else if (recomendee == 'N' || recomendee == 'n'){
                    String citizenshipInput = JOptionPane.showInputDialog("Enter citizenship code");
                    char citizenship = recomendeeInput.charAt(0);

                    if (citizenship == 'C' || citizenship == 'c') {
                        String output = "You are accepted!";
                        JOptionPane.showMessageDialog(null, output);
                    } else if (citizenship == 'N' || citizenship == 'n') {
                        String output = "You are rejected!";
                        JOptionPane.showMessageDialog(null, output);
                    } else {
                        String output = "Invalid Citizenship code!";
                        JOptionPane.showMessageDialog(null, output);
                    }
                } else {
                    String output = "Invalid Recomendee code!";
                    JOptionPane.showMessageDialog(null, output);
                }

            } else {
                String output = "You are rejected!";
                JOptionPane.showMessageDialog(null, output);
            }

        } else {
            String output = "You are rejected!";
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
