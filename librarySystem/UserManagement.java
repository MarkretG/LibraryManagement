package librarySystem;
import java.util.ArrayList;
import java.util.Scanner;
public class UserManagement {
    static ArrayList<User> users= new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public static void initialUser() {
        users.add(new User("mark","pass1",101));
        users.add(new User("ams","pass2",102));
        users.add(new User("vino","pass3",103));
    }
    public static  User verifyUser(){
        System.out.println("enter user name");
        String name = scanner.nextLine();
        User currentUser=null;
        for(User user:users){
            if(user.getName().equals(name)){
                currentUser=user;
                break;
            }
        }
        if(currentUser==null){
            System.out.println("User not exists try signing in ");
            return null;
        }
        System.out.println("enter password");
        String enteredPassword = scanner.nextLine();
        if(enteredPassword.equals(currentUser.getPassword())){
            return currentUser;
        }

        return null;

    }


}
