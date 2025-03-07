import java.util.*;
class cpyArray{
   
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
            arr2[i]=arr1[i];
        }
        
        
        //printing array arr1
        System.out.println("Printing Old Array");
        for(int i=0;i<arr1.length;i++){
            System.out.println(i+":"+arr1[i]);
            
        }
        //printing array2
        System.out.println("Printing New Array");
        for(int j=0;j<arr1.length;j++){
            System.out.println(j+":"+arr2[j]);
        }
        
    }
}