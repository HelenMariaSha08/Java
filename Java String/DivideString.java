// Java Program to divide a string in 'N' equal parts.
/*
input: aaabbbccc
output:
aaaa
bbbb
cccc
*/
import java.util.*;
public class DivideString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		System.out.println("enter number of parts to divide");
		int n=sc.nextInt();
		int len=str.length();
		if(len%n==0){
		    int q=len/n;
		    System.out.println("The String "+ str+" can be divided into "+n+" parts");
		    for(int i=0;i<len;i++){
		        for (int j=i;j<q+i;j++){
		            System.out.print(str.charAt(j)+" ");
		        }
		        System.out.println();
		        i=i+q-1;
		        
		    }
		    
		}
		else{
		    System.out.println("We cannot divide the string "+str);
		}
		
		
	}	
}