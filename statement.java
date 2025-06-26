import java.util.Scanner;
public class statement {
    public static void main(String args[]){
        int age;
        System.out.println("Enter your age: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        if(age<18){
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    
}
