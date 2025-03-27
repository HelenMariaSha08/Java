//Hava program to learn the use of lambda expression and Functional Interface .
//Calculator program
//Familiarization of Java 8 Features
import java.util.*;
interface Calculator{
    void add(int a,int b);
    default void multiply(int a,int b){
        int product=a*b;
        System.out.println("Product of "+a+" x "+b+" is "+product);
        
    }
}
class LambdaExpressionExample{
    public static void main(String []args){
        Calculator calc=(a,b)->System.out.println("Sum is "+(a+b));
        calc.add(5,10);
        calc.multiply(4,9);
    }
}
