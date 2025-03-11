import java.util.*;
public class RightRotation
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of Array");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter number of rotation");
		int r=sc.nextInt();
		for(int i=0;i<r;i++){
		    int last=arr[n-1];
		    for(int j=n-2;j>=0;j--){
		        arr[j+1]=arr[j];
		    }
		    arr[0]=last;
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}