import java.util.*;
import java.util.Arrays;  
public class Reverse {  
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        
            
            
        
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            
        }
        
    }
}  