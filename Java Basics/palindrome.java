import java.util.*;
public class Palindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String st=sc.nextLine();
        String rev="";
        for (int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        if(rev.equalsIgnoreCase(st)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
