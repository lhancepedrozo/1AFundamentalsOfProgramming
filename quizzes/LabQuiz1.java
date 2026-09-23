import java.io.*;
import java.time.Year;
public class LabQuiz1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Enter your birth year: ");
            String birthYear = dataIn.readLine();
            int year = Integer.parseInt(birthYear);
            int currentYear = Year.now().getValue();

            int age = currentYear - year;

            System.out.println("You are born last: " + year + "\n" +
                               "You are now " + age + " yrs old.");
        } catch (IOException e) {
            System.err.println("Invalid number format! Please enter digits only");
        }
    }
}
