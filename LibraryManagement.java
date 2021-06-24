package librarySystem;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();

    public static void main(String[] args) {
        UserManagement.initialUser();
        BookManagement.initialBooks();
        System.out.println("Enter 1 for Login");
        int choice = sc.nextInt();
        User current = UserManagement.verifyUser();
        switch (choice) {
            case 1: {
                if (current != null) {
                    System.out.println("login successfully");
                    System.out.println("1.book fetching" + " "+"2.available books" + "3.book returning" + " " +"4.details of current user"+ "4.logout");
                    while (true) {
                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                System.out.println("which book you want");
                                BookManagement.fetching(current);
                                details(current);
                                break;
                            case 2:
                                BookManagement.showAvailableBooks();
                                break;

                            case 3:
                                System.out.println("which book you return");
                                BookManagement.returning(current);
                                break;
                            case 4:
                                details(current);
                                break;
                            case 5:
                                System.out.println("exit");
                                System.exit(0);
                                break;
                        }
                    }

                }

            }
        }

    }


        public static void details(User current)
        {
            System.out.println(current.getName()+" "+current.getPassword()+" "+current.getUserid());
            for(Book b:User.booksHaving) {
                if(b.getBookStatus().equals("null"))
                    System.out.println(b.getBookName());
            }


        }
}




