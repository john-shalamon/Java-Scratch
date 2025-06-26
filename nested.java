import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        int age = 0;
        char gender = ' ';
        char maritalStatus;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marital Status M/U:");
        maritalStatus = in.next().charAt(0);

        if (maritalStatus == 'u' || maritalStatus == 'U') {
            System.out.println("Enter your gender M/F:");
            gender = in.next().charAt(0);

            System.out.println("Enter your age:");
            age = in.nextInt();

            if ((gender == 'm' || gender == 'M') && (age >= 30)) {
                System.out.println("You are eligible for the insurance");
            } else if ((gender == 'f' || gender == 'F') && (age >= 25)) {
                System.out.println("You are eligible for the insurance");
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("You are not eligible for the insurance");
        }
    }
}
// This code checks eligibility for insurance based on marital status, gender, and age.