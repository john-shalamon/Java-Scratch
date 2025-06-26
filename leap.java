import java.util.Scanner;
public class leap {
    public static void main(String args[]) {
        int year;
        System.out.println("Enter a year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
