import java.util.Scanner;
public class Assignment4_2 {
    /** This code asks the user to input the applicant’s height, age, citizenship code(“C” for citizen of Endor,
     * “N” for non-citizen), and recommendee code (“R” for recommendee, “N” for non-recommendee) and then
     * output whether the applicant is accepted or rejected. */
    public static void main(String[] args) {
        System.out.println("==========JEDI KNIGHT MILITARY ACADEMY==========");

        // Declaring Scanner as input type
        Scanner input = new Scanner(System.in);

        // Asks the user for inputs
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter recomendee code: ");
        char recomendee = input.nextLine().charAt(0);

        if (code == 'R' || code == 'r') {
            System.out.println("You are accepted!");

        } else if ( code == 'C' || code == 'c'){
            if (height >= 200) {

                if(age >= 21 && age <= 25) {
                    System.out.println("You are accepted!");
                } else {
                    System.out.println("You are rejected!");
                }

            } else {
                System.out.println("You are rejected!");
            }
        } else if (code == 'N' || code == 'n') {
            System.out.println("You are rejected!");
        } else {
            System.out.println("Invalid Code");
        }

    }
}
