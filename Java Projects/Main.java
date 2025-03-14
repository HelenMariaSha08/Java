//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Calculator program in Java
import java.util.*;

import static java.lang.System.exit;

interface  CalculatorServices{
    double add(double a,double b);
    double sub(double a,double b);
    double mul(double a,double b);
    double div(double a,double b);
}
abstract class AbClass implements CalculatorServices{
    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
         return a-b;
    }

}
class Cclass extends AbClass{
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        if(b==0){
            System.out.println("Division by zero is not possible");
            return 0;
        }
        else{
            return a/b;

        }


    }

}
class Main{

    public static void main (String [] args){
        Cclass obj=new Cclass();
        Scanner sc=new Scanner(System.in);
        int opt;
        double a,b;

        do {
            System.out.println("WELCOME TO THE CALCULATOR WORLD \n Enter the services to be performed \n option 1 : Addittion\n option 2 :Subtraction \n option 3 : Multiplication \n option 4 : Division\n option 5 : Exit Calculator Services\n\n");
            opt=sc.nextInt();

            switch (opt){
                case 1 :System.out.println("Enter the number 1");
                        a=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        b=sc.nextDouble();
                        System.out.println("Sum: " + obj.add(a,b));
                        break;
                case 2: System.out.println("Enter the number 1");
                        a=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        b=sc.nextDouble();
                        System.out.println("Difference: " + obj.sub(a, b));
                        break;
                case 3:System.out.println("Enter the number 1");
                        a=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        b=sc.nextDouble();
                        System.out.println("Product: " + obj.mul(a,b));
                        break;
                case 4: System.out.println("Enter the number 1");
                        a=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        b=sc.nextDouble();
                        System.out.println("Quotient: " + obj.div(a, b));
                        break;
                case 5 :System.out.println("You are exiting the Calculator Services.\n THANK YOU");
                        exit(0);
                default:System.out.println("Invalid option" );
                        break;
            }

        }
        while(opt!=5);

    }
}