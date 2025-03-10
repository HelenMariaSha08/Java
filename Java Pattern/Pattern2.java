import java.util.*;
public class Pattern2
{
	public static void main(String[] args) {
		System.out.println("Enter number of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<2*n+1;j++){
		        if(j<n){
		            if(j==i){
		                System.out.print("*");
		            }
		            else{
		                System.out.print("0");
		            }
		        }
		        else if(j==n){
		            System.out.print("*");
		        }
		        else{
		            if(j==(2*n)-i){
		                System.out.print("*");
		            }
		            else{
		                System.out.print("0");
		            }
		        }
		        
		        
		    }
		    System.out.println();
		}
	}
}