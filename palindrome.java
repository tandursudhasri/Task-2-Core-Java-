import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class palindrome {
    static void palindrome(String str){
        int flag=0;
        int l=str.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(l)){
                flag=1;
                l--;
            }
            else{
                flag=0;
                break; 
            }   
        }
        if(flag==1){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word:");
        String str=sc.next();
        palindrome(str);
    }
}
