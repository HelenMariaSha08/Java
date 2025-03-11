import java.util.*;
public class OddEvenPosArr
{
	public static void main(String[] args) {
		System.out.println("enter number of elements");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		System.out.println("Array of odd positions");
		for (int i=0;i<n;i++){
		    if(i%2==0){
		        System.out.print(arr[i]+" ");
		        
		    }
		}
		System.out.println();
		System.out.println("Array of even positions");
		for (int i=0;i<n;i++){
		    if(i%2!=0){
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		   
		}
	}
}