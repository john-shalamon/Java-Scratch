import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        int age ;
        boolean hasLicense = true;
        boolean hasInsurance = true;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = in.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
            
            if (hasLicense) {
                System.out.println("You have a driver's license.");
                
                if (hasInsurance) {
                    System.out.println("You can drive legally!");
                } else {
                    System.out.println("You need insurance to drive.");
                }
            } else {
                System.out.println("You need a driver's license to drive.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
    }
}