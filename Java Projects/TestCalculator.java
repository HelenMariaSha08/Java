//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Calculator program in Java
import java.util.*;



interface  CalculatorService{
    double add(double num1,double num2);
    double sub(double num1,double num2);
    double mul(double num1,double num2);
    double div(double num1,double num2);
}
abstract class AbstractCalculator implements CalculatorService{
    public double add(double num1,double num2){
        return num1+num2;
    }
    public double sub(double num1,double num2){
         return num1-num2;
    }

}
class CalculatorImpl extends AbstractCalculator{
    public double mul(double num1,double num2){
        return num1*num2;
    }
    public double div(double num1,double num2){
        if(num2==0){
            System.out.println("Division by zero is not possible");
            return 0;
        }
        else{
            return num1/num2;

        }


    }

}
class TestCalculator{

    public static void main (String [] args){
        CalculatorImpl calculator=new CalculatorImpl();
        Scanner sc=new Scanner(System.in);
        int option;
        double num1,num2;

        do {
            System.out.println("WELCOME TO THE CALCULATOR WORLD \n Enter the services to be performed \n option 1 : Addittion\n option 2 :Subtraction \n option 3 : Multiplication \n option 4 : Division\n option 5 : Exit Calculator Services\n\n");
            option=sc.nextInt();

            switch (option){
                case 1 :System.out.println("Enter the number 1");
                        num1=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        num2=sc.nextDouble();
                        System.out.println("Sum: " + calculator.add(num1,num2));
                        break;
                case 2: System.out.println("Enter the number 1");
                        num1=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        num2=sc.nextDouble();
                        System.out.println("Difference: " + calculator.sub(num1,num2));
                        break;
                case 3:System.out.println("Enter the number 1");
                        num1=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        num2=sc.nextDouble();
                        System.out.println("Product: " + calculator.mul(num1,num2));
                        break;
                case 4: System.out.println("Enter the number 1");
                        num1=sc.nextDouble();
                        System.out.println("Enter the number 2");
                        num2=sc.nextDouble();
                        System.out.println("Quotient: " + calculator.div(num1, num2));
                        break;
                case 5 :System.out.println("You are exiting the Calculator Services.\n THANK YOU");
                        break;
                default:System.out.println("Invalid option" );
                        break;
            }

        }
        while(option!=5);

    }
}