import java.util.Scanner;
public class Assignment3_2 {
    /** This code asks the user to input parents salary, NSAT score, and entrance exam score
     * and then identify if he/she is accepted, rejected, or need further study. */
    public static void main(String[] args) {
        System.out.println("==========ELIGIBLE SCHOLAR IDENTIFIER==========");

        // Declares Scanner as input type
        Scanner input = new Scanner(System.in);

        // Asks the user to input parents salary
        System.out.print("Enter parents monthly salary: ");
        double monthlySalary = input.nextDouble();

        // Asks the user to input NSAT score
        System.out.print("Enter NSAT score: ");
        double nsatScore = input.nextDouble();

        // Asks the user to input ET score
        System.out.print("Enter Entrance Exam score: ");
        double etScore = input.nextDouble();

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

    }
}
