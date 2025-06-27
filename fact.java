import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        int i,n,f;
        f = 1;
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++){
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
    }
    
}
