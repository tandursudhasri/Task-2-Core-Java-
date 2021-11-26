import java.util.*;
public class fact {
    static int factorial(int x){
        if(x==0) return 1;
        else
            return x*factorial(x-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=sc.nextInt();
        System.out.println(factorial(x));
    }
}
