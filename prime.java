import java.util.*;
public class prime{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean flg=false;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
            
        }
        else{
            for (int i=2;i<n/2;i++)
            {
                if(n%i==0){
                    System.out.println("the number is not prime");
                    flg=true;
                    break;
                    
                }
            
            }
        }
        if (flg==false){
            System.out.println("prime");
        }
        
    }
}