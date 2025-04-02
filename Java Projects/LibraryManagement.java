//The program simulates a Library Management System, where books can be added,
//borrowed, and returned using Java collections like ArrayList and HashMap.
import java.util.*;
class Book{
    int bookId;
    String title;
    String author;
    boolean isAvailable;
    //constructor
    public Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public String toString(){
        return "Book ID: "+bookId+"\nTitle: "+title+"\nAuthor: "+author+"\nStatus: "+isAvailable+"\n";
    }
    
}
class LibraryManagement{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        //ArrayList <Book> arr=new ArrayList<>();
        Map<Integer,Book> Mbooks=new LinkedHashMap<> ();
        
        do{
           System.out.println("""
           WELCOME TO LIBRARY SYSTEM
          
           Enter your choice
           1. ADD BOOKS
           2. VIEW AVAILABLE BOOKS
           3. BORROW A BOOK
           4. RETURN A BOOK
           5. VIEW BORROWED BOOKS
           6. EXIT FROM THE LIBRARY SYSTEM"""); 
           choice=sc.nextInt();
           switch(choice){
               case 1 :System.out.println("Enter the Book ID");
               int inputId=sc.nextInt();
               sc.nextLine();
              
               if(Mbooks.containsKey(inputId)){
                   System.out.println("This record already exists");
               }
               else{
                   System.out.println("Enter Book Title");
                   String inputTitle=sc.nextLine();
                   System.out.println("Enter Book Author");
                   String inputAuthor=sc.nextLine();
                   Book b1=new Book(inputId,inputTitle,inputAuthor);
                   Mbooks.put(b1.bookId,b1);
                   System.out.println("Successfully Added");
                   
                   
               }
               break;
               case 2:if(Mbooks.isEmpty()){
                   System.out.println("The Library is empty\n");
               }
               else{
                       Mbooks.forEach((key,value)->System.out.println(value));
               
               }
               break;
               case 3:System.out.println("Enter the ID of book to be borrowed");
               int borrowID=sc.nextInt();
               if(Mbooks.containsKey(borrowID)){
                   Book b2=Mbooks.get(borrowID);
                   if(b2.isAvailable){
                       b2.isAvailable=false;
                       
                       //arr.add(b2);
                       //arr.forEach(System.out::println);
                       System.out.println("You have borrowed the book\n"+b2+"Successfully Borrowed");
                       
                   }
                   else{
                       System.out.println("Sorry,the book is already borrowed");
                   }
               }
               else{
                   System.out.println("Book not Found");
               }
               break;
               case 4:System.out.println("Enter the ID of book to be returned");
               int returnID=sc.nextInt();
               if(Mbooks.containsKey(returnID)){
                   Book b3=Mbooks.get(returnID);
                   if(b3.isAvailable){
                       System.out.println("The book is not borrowed");
                       
                       
                   }
                   else{
                       b3.isAvailable=true;
                       //arr.remove(b3);
                       System.out.println("You have returned the book\n"+b3+"Successfully Returned");
                       
                   }
               }
               else{
                   System.out.println("Book not Found");
               }
               break;
               case 5:boolean found=false;
                   for (Book b:Mbooks.values()){
                   if(b.isAvailable==false){
                       System.out.println(b);
                       found=true;
                   }
               }
               if(found==false){
                   System.out.println("Borrow list is empty");
               }
               break;
               case 6:System.out.println("You are exiting...");
               break;
               default:System.out.println("INVALID OPTION\n");
            } 
                
        }
        while(choice!=6);
    }
}