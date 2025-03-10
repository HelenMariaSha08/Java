import java.util.*;
public class LeftRotation
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rotation");
		int r=sc.nextInt();
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter elements of the array");
		int [] arr1=new int[n];
		
		for(int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		    
		}
		System.out.println("the original array ");
		for(int i=0;i<n;i++){
		    
		    System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<r;i++){
		    int first=arr1[0];
		    int j;
		    for( j=0;j<n-1;j++){
		       arr1[j]=arr1[j+1];
		       
		          
		    }
		    arr1[j]=first;
		    
		    
		}
		System.out.println("the array after rotation");
		for(int i=0;i<n;i++){
		    
		    System.out.print(arr1[i]+" ");
		}
		
		
		
		
	}
}