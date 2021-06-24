package librarySystem;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Book> books= new ArrayList();
    Book b=new Book();

    public static void initialBooks() {
        books.add(new Book("theory of everything","stephen",12,"physics","available"));
        books.add(new Book("human anatomy","mark",13,"biology","available"));
        books.add(new Book("differential","tom",14,"maths","available"));
    }

    public static void showAvailableBooks() {

        for(Book book:books){
                System.out.println(" Book name :" + book.getBookName()+" Author name :" + book.getAuthorName()+" Book id :" + book.getBookId()+" Book department :" + book.getDepartment()+"Book status:"+book.getBookStatus());
        }
    }
    public static void fetching(User currentUser)
    {
        String book=sc.nextLine();
        int flag=0;
        Book currentHaving=null;
        for(Book b:books)
        {
            if(b.getBookName().equals(book)&&b.getBookStatus().equals("available")) {
                currentHaving=b;
                flag=1;
                b.setBookStatus("null");
                currentUser.booksHaving.add(new Book(currentHaving.getBookName(),currentHaving.getAuthorName(),currentHaving.getBookId(),currentHaving.getDepartment(),currentHaving.bookStatus));
               break;
            }
        }
        if(flag==0)
            System.out.println("entered book is not available");
    }
    public static void returning(User currentUser)
    {
        String book=sc.nextLine();
        int signal=0;
            for (Book bi : books) {
                if (bi.getBookStatus().equals("null") && bi.getBookName().equals(book)) {
                    bi.setBookStatus("available");
                    bi.getBookStatus();
                    signal = 1;
                    break;
                }
            }

        if(signal==0)
            System.out.println("you never have this book");
    }

    public void addBook(User currentUser,int bookId){
        Book matchedBook = null;
        for(Book book:books){
            if(book.getBookId()==bookId){
                matchedBook=book;
                break;
            }
        }



        currentUser.booksHaving.add(matchedBook);
        matchedBook.isBooked =true;

    }
}

