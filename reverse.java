import java.util.*;
public class reverse
{
    static String reverse(String s)
    {
        String rev ="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static void main(String hehe[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev ="";
        rev = reverse(str);
        System.out.println("Reverse of given string is: "+rev);
    }
}
