import java.util.Scanner;

public class LogIn{

    public static void main(String[] args) throws Exception{
        System.out.println("----------------------\n");
        Scanner scanner = new Scanner(System.in);
        boolean userANDpass = true;

        while(userANDpass)
        {
        System.out.println("\n- Cooper & Rocco's Warehouse -\n");
        System.out.print("Username: ");
        String input_username = scanner.nextLine();
        System.out.print("Password: ");
        String input_password = scanner.nextLine();

        if(input_username.equals("MMiller-001") && input_password.equals("MM1-123abc")){
            System.out.println("\nSuccesful login\n");

            //Creates the employee(User)
            Employee printEmployeeInfo = new Employee("Micheal", "Miller", 
            "123-456-7890", "Micheal05Miller@gmail.com", input_username, 
            input_password, 123456, "MMiller001@company.com");
            
            //Sends user to CenterHub after logging in 
            CenterHub.main(printEmployeeInfo);
            break;
        }
        else{
            System.out.println("\nInvalid credentials");
        }
        }

        scanner.close();
    }
}