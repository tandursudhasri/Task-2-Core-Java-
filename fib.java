import java.util.*;
public class fib {
    static int fibonacci(int x){
        if(x<=1){
            return x;
        }
        else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the desired number of values: ");
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
