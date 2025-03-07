import java.util.*;
class Peterson{
    public static int fact(int l){
        int fac=1;
        while(l!=0){
            fac=fac*l;
            l--;
        }
        return fac;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int ncpy=n;
        int s=0;
        while(n!=0){
            int l=n%10;
            int f=fact(l);
            s=s+f;
            n=n/10;
        }
        if(s==ncpy){
            System.out.println("The number is Peterson number");
        }
        else{
            System.out.println("Not Peterson number");
        }
       
    }
}