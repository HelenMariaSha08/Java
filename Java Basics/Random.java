import java.util.*;
//import java.lang.Math;
class Random{
    public static void main (String[] args) {
       int min=400;
       int max=800;
       int a=(int)(Math.random() * (max-min+1)+min);
       System.out.println(a);
    }
}