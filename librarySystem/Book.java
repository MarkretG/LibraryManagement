package librarySystem;
import java.util.ArrayList;
public class Book {
    String bookName,authorName;
    int  bookId;
    String department;
    String bookStatus;
    boolean isBooked;
    public Book(String bookName,String authorName,int bookId,String department,String bookStatus)
    {
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookId=bookId;
        this.department=department;
        this.bookStatus=bookStatus;

    }

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
}
