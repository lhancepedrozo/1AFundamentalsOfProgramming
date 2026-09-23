import javax.swing.JOptionPane;
import java.awt.*;
public class LabQuiz2 {

    public static void main(String[] args) {

        String hi = "Welcome to Adobo Cooking Show";
        JOptionPane.showMessageDialog(null, hi);

        String name;
        name = JOptionPane.showInputDialog("Please enter your name");

        int pork;
        pork = Integer.parseInt(JOptionPane.showInputDialog("Please enter kilo of pork"));

        double soy = pork * 0.5;
        double vinegar = pork * 0.3;

        String msg = "The ratio of soy for " + pork + "kg is = " + soy + "\n" + "The ratio of vinegar for " + pork + "kg is = " + vinegar;
        JOptionPane.showMessageDialog(null, msg);
    }
}
