import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3_1 {
    /** This code asks the user to input parents salary, NSAT score, and entrance exam score
     * and then identify if he/she is accepted, rejected, or need further study. */
    public static void main(String[] args) {
        System.out.println("==========ELIGIBLE SCHOLAR IDENTIFIER==========");

        // Declares Buffered reader as input type
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Asks the user to input parents salary
            System.out.print("Enter parents monthly salary: ");
            String monthlySalaryInput = input.readLine();
            double monthlySalary = Double.parseDouble(monthlySalaryInput);

            // Asks the user to input NSAT score
            System.out.print("Enter NSAT score: ");
            String nsatScoreInput = input.readLine();
            double nsatScore= Double.parseDouble(nsatScoreInput);

            // Asks the user to input ET score
            System.out.print("Enter Entrance Exam score: ");
            String etScoreInput = input.readLine();
            double etScore= Double.parseDouble(etScoreInput);

            System.out.println();

            // Identifies if he/she is eligible
            if (monthlySalary < 0) {
                    System.out.println("Invalid Salary!");
                } else if (monthlySalary >= 0 && monthlySalary <= 3500) {

                    if (nsatScore >= 91) {

                        if (etScore >= 91) {
                            System.out.println("You are eligible for the scholarship!");
                        } else if (etScore >= 85 && etScore <= 90) {
                            System.out.println("You are under further study based on situation!");
                        } else if (etScore < 85) {
                            System.out.println("You are not eligible for the scholarship!");
                        }

                    } else if (nsatScore == 90) {
                        System.out.println("You are under further study based on situation!");
                    } else if (nsatScore < 90){
                        System.out.println("You are not eligible for the scholarship!");
                    }

                }else if (monthlySalary >= 3501 && monthlySalary <= 10000) {

                    if (nsatScore >= 90) {

                        if (etScore >= 85 && etScore <= 90) {
                            System.out.println("You are under further study based on situation!");
                        } else if (etScore < 85) {
                            System.out.println("You are not eligible for the scholarship!");
                        }

                    } else if (nsatScore < 90){
                        System.out.println("You are not eligible for the scholarship!");
                    }

                } else if (monthlySalary > 10000) {
                    System.out.println("You are not eligible for the scholarship!");
                }

        } catch (IOException e) {
            System.err.print("Invalid Inputs!");
        }
    }
}