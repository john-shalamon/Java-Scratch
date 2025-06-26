import java.util.Scanner;
public class doloop{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();
        int i = 1;
        
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        
        
}
    
}
