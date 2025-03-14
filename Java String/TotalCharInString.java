// Java Program to count the total number of characters in a string
import java.util.*;
public class TotalCharInString
{
	public static void main(String[] args) {
		System.out.println("Enter words");
		Scanner sc=new Scanner(System.in);
		String words=sc.nextLine();
		int count=0;
		for(int i=0;i<words.length();i++){
		    if(words.charAt(i)!=' '){
		        count++;
		        
		    }
		}
		System.out.println("The total number of characters in the string : "+count);
	}
}