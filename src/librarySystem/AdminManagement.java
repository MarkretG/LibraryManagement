package librarySystem;
import java.util.ArrayList;
import java.util.Scanner;
public class AdminManagement {
    static ArrayList<Admin> admins= new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public static void initialAdmin() {
        admins.add(new Admin("vino", "System1", 123));
        admins.add(new Admin("jana", "System2", 345));
    }
    public static  Admin verifyAdmin(){
        System.out.println("enter admin name");
        String name = scanner.nextLine();
        Admin currentAdmin=null;
        for(Admin admin:admins){
            if(admin.getAdminName().equals(name)){
                currentAdmin=admin;
                break;
            }
        }
        if(currentAdmin==null){
            System.out.println("User not exists try signing in ");
            return null;
        }
        System.out.println("enter admin password");
        String enteredPassword = scanner.nextLine();
        if(enteredPassword.equals(currentAdmin.getAdminPassword())){
            return currentAdmin;
        }

        return null;

    }


}
