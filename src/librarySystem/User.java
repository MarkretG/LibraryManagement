package librarySystem;
import java.util.ArrayList;
public class User {
    String name, password;
    int userid;
   static ArrayList<Book> booksHaving=new ArrayList<>();

    public User(String name, String password,int userid) {
        this.name = name;
        this.password = password;
        this.userid=userid;

    }

    public static ArrayList<Book> getBooksHaving() {
        return booksHaving;
    }

    public static void setBooksHaving(ArrayList<Book> booksHaving) {
        User.booksHaving = booksHaving;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
