import java.util.*;
public class calc
{
    static void Add(int a, int b)
    {
        System.out.println("Addition = " + (a + b));
    }
    static void Sub(int a, int b)
    {
        System.out.println("Subtraction = " + (a - b));
    }
    static void Mul(int a, int b)
    {
        System.out.println("Multiplication = " + (a * b));
    }
    static void Div(int a, int b)
    {
        if(a>b && b!=0)
            System.out.println("Division = " +(float) (a / b));
        else
            System.out.println("First number is smaller than second , TRY AGAIN");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x= sc.nextInt();
        System.out.print("Enter second number:");
        int y= sc.nextInt();
        System.out.println("Enter the operation of your choice (A, S, M, D):");
        char c=sc.next().charAt(0);
        switch(c){
            case 'A': Add(x,y);
            break;
            case 'S': Sub(x,y);
            break;
            case 'M': Mul(x,y);
            break;
            case 'D': Div(x,y);
            break;
            default: System.out.println("Enter a proper choice");
            break;
            
        }
    }
}
