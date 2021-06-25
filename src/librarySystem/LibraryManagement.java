package librarySystem;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("welcome to library management system ");
        UserManagement.initialUser();
        BookManagement.initialBooks();
        AdminManagement.initialAdmin();
        System.out.println("1.User Login" + " " + "2.admin login");
        main:
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    User current = UserManagement.verifyUser();
                    if (current != null) {
                        System.out.println("login successfully");
                        System.out.println("1.book fetching" + " " + "2.available books" + "3.book returning" + " " + "4.details of current user" + "4.logout");
                        while (true) {
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    System.out.println("which book you want");
                                    BookManagement.fetching(current);
                                    break;
                                case 2:
                                    BookManagement.showAvailableBooks();
                                    break;

                                case 3:
                                    System.out.println("which book you return");
                                    BookManagement.returning(current);
                                    break;
                                case 4:
                                    System.out.println(current.getName() + " " + current.getPassword() + " " + current.getUserid());
                                    for (Book b : User.booksHaving) {
                                        if (b.getBookStatus().equals("not available"))
                                            System.out.println(b.getBookName());
                                    }
                                    break;
                                case 5:
                                    System.out.println("exit");
                                    System.exit(0);
                                    break;
                            }
                        }

                    } else
                        System.out.println("invalid user name or password");
                }
                case 2: {
                    Admin currentAdmin = AdminManagement.verifyAdmin();
                    if (currentAdmin != null) {
                        System.out.println("login successfully");
                        System.out.println("1.add book" + " "+"2.Books details" + "3.remove book" + " " + "4.logout");
                        while (true)
                        {
                            int c=sc.nextInt();
                            switch (c)
                            {
                                case 1: {
                                    String bStatus = "available";
                                    System.out.println("enter book name");
                                    sc.nextLine();
                                    String bName = sc.nextLine();
                                    System.out.println("enter book id");
                                    int bId = sc.nextInt();
                                    System.out.println("enter author name");
                                    sc.nextLine();
                                    String bAuthor = sc.nextLine();
                                    System.out.println("enter department");
                                    String bDept = sc.nextLine();
                                    sc.nextLine();
                                    BookManagement.addBook(bName, bAuthor, bId, bDept, bStatus);
                                    break;
                                }
                                case 2:
                                    for (Book b:BookManagement.books)
                                        System.out.println(b.getBookName());
                                    break ;


                                case 3:
                                    System.out.println("which book you want to remove");
                                    int id= sc.nextInt();
                                    BookManagement.removeBook(id);
                                    break;
                                case 4:
                                    continue main;
                            }
                        }
                    }
                }
            }

        }


        }
    }




