import java.util.*;
class Factorial{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int n=sc.nextInt();
        int fact=1;
        for (int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("The factorial of " +n+ "is" +fact);
    }
}