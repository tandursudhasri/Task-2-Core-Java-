import java.util.*;
public class pattern
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int space = 1;
        space = n - 1;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= space; j++) 
            {
                System.out.print(" ");
            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (int i = 1; i <= n - 1; i++) 
        {
            for (int j = 1; j <= space; j++) 
            {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= 2 * (n - i) - 1; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
