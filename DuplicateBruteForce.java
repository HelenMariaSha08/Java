import java.util.*;
import java.util.Arrays;  
public class DuplicateBruteForce {  
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int visited=-1;
        int j;
        int fr []=new int[n];
        for(int i=0;i<n;i++){
            int cnt=1;
            for( j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    fr[j]=visited;
                    
                }
            
            }
            if(fr[i]!=visited){
                fr[i]=cnt;
            }
            
            
        }
        for(int i=0;i<n;i++){
            if(fr[i]>=2){
                System.out.println(arr[i]+"is the duplicate number");
            }
        }
        
    }
}  