//Program to learn equals() method and hashCode()method to compare objects
import java.util.*;
class Bird{
    String name;
    int id;
    String nickname;
    // creating constructor
    Bird(String name,int id,String nickname){
        this.name=name;
        this.id=id;
        this.nickname=nickname;
    }
    /*public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null || this.getClass()!=obj.getClass()){
            return false;
        }
        Bird b=(Bird)obj;
        return this.name.equals(b.name) && this.id==b.id && this.nickname.equals(b.nickname);
    }*/
    public int hashCode(){
        return Objects.hash(name,id,nickname);

    }
}
class BirdShop{
    public static void main (String[] args) {
        Bird b1= new Bird("Parrot",1,"Mittu");
        Bird b2= new Bird("Pigeon",2,"Suvarna");
        Bird b3= new Bird("Parrot",1,"Mittu");
        Bird b4= new Bird("Pigeon",3,"Suvarna");
        /*System.out.println(b1.equals(b2));//false
        System.out.println(b1.equals(b3));//True
        System.out.println(b2.equals(b4));//False*/
        System.out.println(b1.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b1.hashCode()==b3.hashCode());//True
        System.out.println(b2.hashCode()==b4.hashCode());//False
    }
}