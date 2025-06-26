import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter two integers:"); // Corrected this line
        a = in.nextInt();
        b = in.nextInt();

        c = (a + b) + (a - b);
        System.out.println("Result is: " + c);
    }
}
