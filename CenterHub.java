import java.util.Scanner;

public class CenterHub{
private static Scanner scanner = new Scanner(System.in);

public static void main(Employee employee) throws Exception{
        System.out.println("----------------------\n");
        System.out.println("Welcome back " + employee.getEmployee_First_Name() + "!\n");

        //Giving Employee their Menus based on access levels
        switch(employee.getPositions_Access_Level())
        {
            case "1":       Worker_Menu(employee);      break;
            case "2":       Manager_Menu(employee);     break;
            case "3":       CEO_Menu(employee);         break;
        }
        scanner.close();
        System.out.println("\n----------------------");
    }

    //Worker's Menu 
    private static void Worker_Menu(Employee employee)
        {
            //String userInput = "";
           //boolean CorrectOption = true;
            
            System.out.println("--- Worker's Menu ---");
            System.out.println("\n1. View my profile"
            + "\n2. View Schedule");
            System.out.println();

        }

    //Manager's Menu
    private static void Manager_Menu(Employee employee)
        {
            //String userInput = "";
            //boolean CorrectOption = true;

            System.out.println("--- Manager's Menu ---");
            System.out.println("\n1. View my profile" 
            + "\n2. View my Schedule");
            }
    
    //CEO's Menu 
    private static void CEO_Menu(Employee employee)
        {
            String userInput;
            boolean CorrectOption = true;

            while(CorrectOption)
            {
            System.out.println("--- CEO's Menu ---");
            System.out.println("\n1. View Profile" 
            + "\n2. View all Employees"
            + "\n3. View all Departments"
            + "\n4. View all Programs");

            System.out.println("Please select a NUMBER for option: ");
            userInput = scanner.nextLine();
            switch(userInput)
            {
                case "1": //CEO's "Profile" 
                    System.out.println("\n- My Profile -\n");
                    System.out.println("Name: " + employee.getEmployee_First_Name() + " " + employee.getEmployee_Last_Name());
                    System.out.println("ID: " + employee.getEmployee_ID());
                    System.out.println("Work Email: " + employee.getEmployee_Work_Email());
                    System.out.println("Position in Company: " + employee.getEmployee_Position());
                    CorrectOption = false;
                break;

                case "2": //View all current "Employees"
                    System.out.println("\n\n");
                    Employee.FakeEmployeeDatabase();
                    CorrectOption = false;
                break;

                case"3": //View all "Departments"
                    System.out.println("\n- Departmetn list -");
                    System.out.println("1. Food & Beverage" 
                        + "\n2. Electronics"
                        + "\n3. Raw Materials"
                        + "\n4. General Merchandise");
                    System.out.println("If you want to access any of these departments");
                    CorrectOption = false;

                case"4": //View all "Programs"
                    System.out.println();
                    CorrectOption = false;

                default:
                    System.out.println("Invalid option");
                break;
            }
            }
        }
}