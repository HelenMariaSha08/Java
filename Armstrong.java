import java.util.*;
class Armstrong{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n;
        int b=n;
        int cnt=0;
        int s=0;
        while(a!=0){
            a=a/10;
            cnt++;
        }
        while(b!=0){
            int l=b%10;
            s=s+(int)Math.pow(l,cnt);
            b=b/10;
            
        }
        if(s==n){
            System.out.println("Armstrong"+n);
        }
        else{
            System.out.println(" not Armstrong"+n);
        }
    }
}