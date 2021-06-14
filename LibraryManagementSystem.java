package Advanced;
import java.util.Scanner;
class Book
{
   public int total_no_of_books=10;
    int count=0,take=0;
     void total()
    {
        int total=total_no_of_books;
        System.out.println(total);
    }
    void available()
    {
        int remaining=total_no_of_books-count;
        System.out.println(remaining);
    }
    void fetch()
    {
        take=take+1;
        count++;
        System.out.println(take+"book taken");
    }
    void returning()
    {
        count--;
        take--;
    }

}
class Login
{
    String name;
    String id;
    Scanner sc=new Scanner(System.in);

   // public String getName() {
   //     return name;
  //  }

    public void name() {
        System.out.println("enter the name");
        name=sc.nextLine();
    }

  //  public String getId() {
  //      return id;
   // }
    public void id() {
        System.out.println("enter the id");
        id=sc.nextLine();
    }

}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to library management system");
        System.out.println("Login");
        Login log=new Login();
        log.name();
        log.id();
        System.out.println("login successfully");
        System.out.println("enter your choice");
        System.out.println("1.Total no of books"+" "+"2.available books"+" "+"3.book fetching"+" "+"4.book returning"+" "+"5.logout");

        Book b=new Book();
        while(true) {
            int choice=sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Total no of books");
                    b.total();
                    break;
                }
                case 2: {
                    System.out.println("Available books");
                    b.available();
                    break;
                }
                case 3: {
                    System.out.println("book fetching");
                    b.fetch();
                    break;
                }
                case 4: {
                    System.out.println("book returning");
                    b.returning();
                    break;
                }
                case 5:
                {
                    System.out.println("logout");
                    System.exit(0);
                }
            }
        }

    }
}
