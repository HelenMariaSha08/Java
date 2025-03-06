import java.util.*;
class Oddeven{
     public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println(args[0]+"enter the num");
        int n=sc.nextInt();
        if(n%2==0){
		System.out.println("The number is even");
	}
	else{ 
	        System.out.println("the number is odd");
	}
     }
}
	
