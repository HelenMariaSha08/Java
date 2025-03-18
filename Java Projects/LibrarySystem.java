class Book {
   String name;
   int price;
   String author;
   //Constructor
   Book(String name,int price,String author){
       this.name=name;
       this.price=price;
       this.author=author;
   }
   public boolean equals(Object obj){
       if(this==obj){
           return true;
       }
       if(obj==null || this.getClass()!=obj.getClass()){
           return false;
       }
       Book bk=(Book) obj;
       return this.name.equals(bk.name) && this.price==bk.price && this.author.equals(bk.author);


   }

}
public class LibrarySystem{
    public static void main(String[] args) {
        Book b1=new Book("Harry Potter",890,"J.K.Rowling");
        Book b2=new Book("The Alchemist",1000,"Paulo Coelho");
        Book b3 =b1;
        Book b4 = new Book("The Alchemist",1000,"Paulo Coelho");
        Book b5= new Book("Romeo and Julliet",1500,"William Shakespere");
        System.out.println("Checking if the two books are the same");
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b2.equals(b4));


    }
}
