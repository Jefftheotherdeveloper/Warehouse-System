import java.util.Scanner;

public class LogIn{

    public static void main(String[] args) throws Exception{
        System.out.println("----------------------\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n- Cooper & Rocco's Warehouse -\n");
        System.out.print("Username: ");
        String input_username = scanner.nextLine();
        System.out.print("Password: ");
        String input_password = scanner.nextLine();

        if(input_username.equals("MMiller-001") && input_password.equals("MM1-123abc")){
            System.out.println("Succesful login, welcome user!");
            Employee employee_class = new Employee();
            employee_class.Employee_Info();
        }
        else{
            System.out.println("Invalid credentials");
        }

        scanner.close();
        System.out.println("\n----------------------");
    }
}