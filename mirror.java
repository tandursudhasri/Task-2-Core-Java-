import java.util.*;
public class mirror
{
    static boolean MirrorInverse(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[arr[i]]!=i)
                return false;
        }
        return true;


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();

        if (MirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

