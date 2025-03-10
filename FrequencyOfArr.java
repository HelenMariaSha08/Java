import java.util.*;
public class FrequencyOfArr{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of elements in the array");
	    int n=sc.nextInt();
	    int [] arr1=new int [n];
	    
	    System.out.println("Enter elements in the array");
	    for(int i=0;i<arr1.length;i++){
	        arr1[i]=sc.nextInt();
	        
	    }
	
	    int [] freq=new int[arr1.length];
	    int visited=-1;
	    for(int i=0;i<arr1.length;i++){
	        int cnt=1;
	        for(int j=i+1;j<arr1.length;j++){
	            if(arr1[i]==arr1[j]){
	                cnt++;
	                freq[j]=visited;
	            
	            }
	        
	        }
	        if(freq[i]!=visited){
	            freq[i]=cnt;
	        }
	        
	    
	    }
	    for(int k=0;k<freq.length;k++){
	        if(freq[k]!=visited){
	            System.out.println(arr1[k]+" : "+freq[k]);
	        }
	    }
	}
}