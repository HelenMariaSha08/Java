//Program with a class Student
import java.util.*;
class Student{
    String name;
    int std;
    char div;
    int age;
    double marks;
    //creating Constructor
    Student(String name,int std,char div,int age,double marks){
        this.name=name;
        this.std=std;
        this.div=div;
        this.age=age;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public static void main (String[] args) {
        
        //creating Object
        Student s1=new Student("HELEN",10,'B',15,95.5);
        System.out.println("NAME : "+s1.getName());
        System.out.println("STD : "+s1.std);
        System.out.println("DIV : "+s1.div);
        System.out.println("AGE : "+s1.age);
        System.out.println("MARKS : "+s1.marks);
    }
}