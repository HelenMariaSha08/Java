/*Java program to print the following pattern
5432*
543*1
54*21
5*321
*4321

*/





import java.util.*;
import java.util.Arrays;  
public class Pattern1 {  
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=(n-j-1)){
                    System.out.print(arr[j]+" ");
                    
                }
                else{
                    System.out.print("* ");
                }
            
                
            }
            System.out.println();
        }
        
    }
}  