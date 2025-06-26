import java.util.Scanner;
public class whileloop{
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}