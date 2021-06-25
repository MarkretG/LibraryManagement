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
                b.setBookStatus("not available");
                currentUser.booksHaving.add(currentHaving);
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
                if (bi.getBookStatus().equals("not available") && bi.getBookName().equals(book)) {
                    bi.setBookStatus("available");
                    currentUser.booksHaving.remove(bi);
                    for (Book b : User.booksHaving) {
                        if (b.getBookStatus().equals("not available"))
                            System.out.println(b.getBookName());
                    }
                    signal = 1;
                    break;
                }
            }

        if(signal==0)
            System.out.println("you never have this book");
    }
    public static void addBook(String bName,String bAuthor,int bId,String bDept,String bStatus)
    {

        books.add(new Book(bName,bAuthor,bId,bDept,bStatus));
        System.out.println("book add successfully");
    }

    public static void removeBook(int bId) {
        Book matchedBook = null;
        int flag=0;
        for (Book book : books) {
            if (book.getBookId() == bId&&book.getBookStatus().equals("available")) {
                matchedBook = book;
                books.remove(matchedBook);
                for (Book b:books)
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("entered book is not available;");
    }



}

