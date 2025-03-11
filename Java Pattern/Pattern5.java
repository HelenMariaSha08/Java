import java.util.*;
public class Pattern5
{
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		int j,i;
		int n=sc.nextInt();
		for (i=1;i<=n;i++){
		    for(j=1;j<=n;j++){
		        if(j<=n-i+1){
		            System.out.print(j);
		        }
		        
		        else{
		            System.out.print("*");
		        }
		    }
		    for(j=n+1;j<=2*n;j++){
		        if(j>=n+i){
		            System.out.print((2*n+1)-j);
		        }
		        
		        else{
		            System.out.print("*");
		        }
		       
		        
		    }
		    System.out.println();
		}
	}
}