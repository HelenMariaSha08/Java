//Student  Class containing name,roll no.,mark which does CRUD operation.
//Not more than 3 Student details can be added.
//Overriding toString() and equals() method
import java.util.*;
class Student{
    String name;
    int rollNum;
    double mark;
    // Creating constructor
    Student(String name,int rollNum,double mark){
        this.name=name;
        this.rollNum=rollNum;
        this.mark=mark;
    }
    public String toString(){
        return "Name : "+ name+"\nRoll No. : "+rollNum+"\nMark : "+mark;
    }
    public boolean equals(Object obj) {
        if (this == obj){
            return true;

        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;

        }
        Student s = (Student) obj;
        return this.rollNum == s.rollNum;
    }

}
class StudentRecord{
    public static void main (String[] args) {
        Student [] arr=new Student[3];
        Scanner sc=new Scanner(System.in);
        int choice;
        int count=0;
        do{
            System.out.println("WELCOME TO STUDENT RECORD");
            System.out.println("ENTER THE CHOICES \n1 : Add\n2 : Delete\n3 : Read\n4 : Exit\n");
            choice=sc.nextInt();
            switch(choice){
                case 1 :if(count>=3){
                    System.out.println("RECORD IS ALREADY FILLED\n\n");
                }
                else{
                    System.out.println("Enter name");
                    String inputName=sc.next();
                    System.out.println("Enter roll number");
                    int inputRoll=sc.nextInt();
                    boolean exists=false;
                    for(int i=0;i<count;i++){

                        if (arr[i].rollNum==inputRoll){
                            System.out.println("ENTRY ALREADY EXISTS,TRY ANOTHER");
                            exists=true;
                            break;
                        }
                    }
                    if(exists==false){
                        System.out.println("Enter marks");
                        double inputMark=sc.nextDouble();
                        Student stud=new Student(inputName,inputRoll,inputMark);
                        arr[count]=stud;
                        count++;
                        System.out.println("SUCCESSFULLY ADDED\n\n");

                    }



                }
                    break;
                case 2:if(count==0){
                    System.out.println("RECORD IS EMPTY\n\n");
                }
                else{
                    System.out.println("Enter the roll number to be deleted");
                    int delRoll=sc.nextInt();
                    boolean flg=false;
                    for(int i=0;i<count;i++){
                        if(arr[i].rollNum==delRoll){
                            flg=true;
                            for(int j=i;j<count-1;j++){
                                arr[j]=arr[j+1];
                            }
                            arr[count-1]=null;
                            count--;

                        }
                    }
                    if(flg==false){
                        System.out.println("ROLL NUMBER NOT FOUND\n\n");
                    }
                    else{
                        System.out.println("SUCCESSFULLY DELETED\n\n");
                    }

                }
                    break;
                case 3:  if(count==0){
                    System.out.println("NO RECORDS FOUND\n\n");
                }
                else{
                    for(int i=0;i<count;i++){
                        System.out.println("Details of Student");
                        System.out.println(arr[i].toString()+"\n");

                    }

                }
                    break;
                case 4 :System.out.println("You are exiting from the Student Record \n THANK YOU !!");
                    break;
                default:System.out.println("Invalid Choice, try again");
            }

        }
        while(choice!=4);


    }
}