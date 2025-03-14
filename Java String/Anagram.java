// Java Program to determine whether two strings are the anagram
import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.nextLine();
		System.out.println("Enter String 2");
		String str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()){
		    System.out.println("The strings are not Anagram");
		}
		else{
		    char [] arr1=str1.toCharArray();
		    char [] arr2=str2.toCharArray();
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    if(Arrays.equals(arr1,arr2)){
		        System.out.println("The strings "+str1+" and "+str2+" are Anagram");
		    }
		    else{
		        System.out.println("The strings are not  Anagram");
		    }
		}
		
		
	}	
}