import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4_1 {
    /** This code asks the user to input the applicant’s height, age, citizenship code(“C” for citizen of Endor,
     * “N” for non-citizen), and recommendee code (“R” for recommendee, “N” for non-recommendee) and then
     * output whether the applicant is accepted or rejected. */
    public static void main(String[] args) {
        System.out.println("==========JEDI KNIGHT MILITARY ACADEMY==========");

        // Declaring buffered reader as input type
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Asks the user for inputs
            System.out.print("Enter height in cm: ");
            String heightInput = input.readLine();
            double height = Double.parseDouble(heightInput);

            System.out.print("Enter age: ");
            String ageInput = input.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.print("Enter recomendee code: ");
            String recomendeeInput = input.readLine();
            char recomendee = recomendeeInput.charAt(0);


            if (height >= 200) {

                if(age >= 21 && age <= 25) {

                    if (recomendee == 'R' || recomendee == 'r') {
                        System.out.println("You are accepted!");
                    } else if (recomendee == 'N' || recomendee == 'n'){
                        System.out.print("Enter citizenship code: ");
                        String citizenshipInput = input.readLine();
                        char citizenship = citizenshipInput.charAt(0);

                        if (citizenship == 'C' || citizenship == 'c') {
                            System.out.println("You are accepted!");
                        } else if (citizenship == 'N' || citizenship == 'n') {
                            System.out.println("You are rejected!");
                        } else {
                            System.out.print("Invalid Citizenship code!");
                        }
                    } else {
                        System.out.print("Invalid Recomendee code!");
                    }

                } else {
                    System.out.println("You are rejected!");
                }

            } else {
                System.out.println("You are rejected!");
            }

        } catch (IOException e) {
            System.err.println("Invalid Inputs!");
        }
    }
}
