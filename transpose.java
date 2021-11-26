import java.util.*;
public class transpose{  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size=sc.nextInt();
        
        int original[][]=new int[size][size];
        int transpose[][]=new int[size][size];
        System.out.println("Enter original matrix: ");
        for(int i=0;i<size;i++){    
            for(int j=0;j<size;j++){    
                original[i][j]=sc.nextInt();
            }
            System.out.println();    
        }       
        
        for(int i=0;i<size;i++){    
            for(int j=0;j<size;j++){    
                transpose[i][j]=original[j][i];  
            }    
        }    
        System.out.println("Transpose of given matrix:");  
        for(int i=0;i<size;i++){    
            for(int j=0;j<size;j++){    
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println();   
        }    
    }
} 
