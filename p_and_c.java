import java.util.*;
public class p_and_c
{
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return fact(n-1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        int permutation = fact(n) / fact(n-r);
        int combination = fact(n) / (fact(r) * fact(n-r));
        

        System.out.println("Permutation = " + permutation + "\n" + "Combination = " + combination);
    }
}