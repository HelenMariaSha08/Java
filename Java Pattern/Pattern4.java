import java.util.*;
public class Pattern4
{
	public static void main(String[] args) {
		System.out.println("enter odd number");
		Scanner sc= new Scanner(System.in);
		int j,i;
		int n=sc.nextInt();
		for (i=0;i<n;i++){
		    for(j=0;j<=(n/2);j++){
		        if(i==j){
		            System.out.print(j+1);
		        }
		        else if((i>n/2) && (j==n-i-1)){
		            System.out.print(j+1);
		            
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    while(j<n){
		        if(j==n-i-1){
		            System.out.print(i+1);
		        }
		        else if(i==j){
		            System.out.print(n-i);
		        }
		        else{
		            System.out.print(" ");
		        }
		        j++;
		        
		    }
		    System.out.println();
		}
	}
}