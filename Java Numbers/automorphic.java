import java.util.*;
class Automorphic{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int ncpy=n;
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        int sq=ncpy*ncpy;
        int sqcpy=sq;
        int l=sq%((int)Math.pow(10,cnt));
        if(l==ncpy){
            System.out.println("Automorphic \nThe number is "+ncpy+"the square"+sqcpy);
        }
        else{
            System.out.println("Not Automorphic \nThe number is"+ncpy+"The square is"+sqcpy);
        }
        
    }
}