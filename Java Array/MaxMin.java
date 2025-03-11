import java.util.*;
public class MaxMin
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The largest number is: "+arr[n-1]);
		System.out.println("The Smallest number is: "+arr[0]);
	}
}