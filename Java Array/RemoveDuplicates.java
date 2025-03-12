/*Java Program to remove duplicate element in an Array
input:
arr[] = {10,20,20,30,30,40,50,50}

Output:

10 20 30 40 50


*/
import java.util.*;
public class RemoveDuplicates
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter array elements");
	    for (int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    int temp[]=new int[n];
	    int visited=-1;
	    for (int i=0;i<n;i++){
	        
	        for(int j=i;j<n-1;j++){
	            if(arr[i]==arr[j+1]){
	                temp[j+1]=visited;
	                
	            }
	           
	        }
	        if(temp[i]!=visited){
	            temp[i]=arr[i];
	        }
	        
	    }
	    System.out.println("The array where the Duplicte elements are removed");
	    for(int k=0;k<temp.length;k++){
	        if(temp[k]!=visited){
	            System.out.print(temp[k]+" ");
	        }
	    }
	    
	    	
	}
}