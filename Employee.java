public class Employee{
    private String Employee_First_Name;
    private String Employee_Last_Name;
    private String Employee_SSN;
    private String Employee_Personal_Email;
    private String Employee_Username;
    private String Employee_Password;
    private int Employee_ID;
    private String Employee_Work_Email;
    private String Employee_Position;

    //no arg constructor
    public Employee(){}
    //loaded constructor
    public Employee(String employee_first_name, String employee_last_name, String employee_ssn, 
        String employee_personal_email, String employee_username, String employee_password, int employee_id, 
        String employee_work_email, String employee_position)
    {
        this.Employee_First_Name = employee_first_name;
        this.Employee_Last_Name = employee_last_name; 
        this.Employee_SSN = employee_ssn;
        this.Employee_Personal_Email = employee_personal_email;
        this.Employee_Username = employee_username;
        this.Employee_Password = employee_password;
        this.Employee_ID = employee_id;
        this.Employee_Work_Email = employee_work_email;
        this.Employee_Position = employee_position;
        Employees_Access_Level();
    }

    //Set and Get method
    public void setEmployee_First_Name(String employee_first_name)
    {
        this.Employee_First_Name = employee_first_name;
    }
    public String getEmployee_First_Name()
    {
        return Employee_First_Name;
    }
    public void setEmployee_Last_Name(String employee_last_name)
    {
         this.Employee_Last_Name = employee_last_name; 
    }
    public String getEmployee_Last_Name()
    {
        return Employee_Last_Name; 
    } 
    public void setEmployee_SSN(String employee_ssn)
    {
        this.Employee_SSN = employee_ssn;
    }
    public String getEmployee_SSN()
    {
        return Employee_SSN;
    }
    public void setEmployee_Personal_Email(String employee_personal_email)
    {
        this.Employee_Personal_Email = employee_personal_email;
    }
    public String getEmployee_Personal_Email()
    {
        return Employee_Personal_Email;
    }
    public void setEmployee_Username(String employee_username)
    {
        this.Employee_Username = employee_username;
    }
    public String getEmployee_Username()
    {
        return Employee_Username;
    }
    public void setEmployee_Password(String employee_password)
    {
        this.Employee_Password = employee_password;
    }
    public String getEmployee_Password()
    {
        return Employee_Password;
    }
    public void setEmployee_ID(int employee_id)
    {
        this.Employee_ID = employee_id;
    }
    public int getEmployee_ID()
    {
        return Employee_ID;
    }
    public void setEmployee_Work_Email(String employee_work_email)
    {
        Employee_Work_Email = employee_work_email;
    }
    public String getEmployee_Work_Email()
    {
        return Employee_Work_Email;
    }
    public void setEmployee_Position(String employee_position)
    {
        this.Employee_Position = employee_position;
    }
    public String getEmployee_Position()
    {
        return Employee_Position;
    }
    
    //Delcaring private infomartion 
    public boolean hasPrivateInfo()
    {
        return !Employee_SSN.isEmpty() || 
               !Employee_Personal_Email.isEmpty() || 
               !Employee_Username.isEmpty() || 
               !Employee_Password.isEmpty();
    }
        
    //Employee's access level
    private String Positions_Access_Level;
    public void Employees_Access_Level()
    {
        switch(Employee_Position.toUpperCase()){
            case "WORKER":      this.Positions_Access_Level = "1";      break;
            case "MANAGER":     this.Positions_Access_Level = "2";      break;
            case "CEO":         this.Positions_Access_Level = "3";      break;
            default:            this.Positions_Access_Level = "0";      break;
        }
    }
    public void setPositions_Access_Level(String Access_Level)
    {
        this.Positions_Access_Level = Access_Level;
    }
    public String getPositions_Access_Level()
    {
        return Positions_Access_Level;
    }

    //Employee's ID badge
    public void Employee_ID_Badge()
    {
        System.out.println("\n======"); 
        System.out.println("\n- Cooper & Rocco's Warehouse -\n");
        System.out.println("\nName: " + getEmployee_First_Name() + " " + getEmployee_Last_Name());
        System.out.println("\nID: " + getEmployee_ID());
        System.out.println("\n======"); 
    }
    
    //ToString method 
    @Override
    public String toString(){
        return "\n- Employee's Infomartion -\n\n"
        + "\nName: " + this.getEmployee_First_Name() + " " + this.getEmployee_Last_Name()
        + "\nSocial Security Number: " + this.getEmployee_SSN()
        + "\nPersonal Email: " + this.getEmployee_Personal_Email()
        + "\nUsername: " + this.getEmployee_Username()
        + "\nPassword: " + this.getEmployee_Password()
        + "\nID: " + this.getEmployee_ID()
        + "\nWork Email: " + this.getEmployee_Work_Email()
        + "\nPosition in Company: " + this.getEmployee_Position()
        + "\n";
    }

    //Fake Employee Database 
    public static Employee[] FakeEmployeeDatabase() 
    {
        Employee[] Fake_Employees = 
        {
            new Employee("Daniel", "Smith", "111-111-1111", "danS1@gmail.com", "DSmith-1", "", 111, "DSmith1@company.com", "Worker"),
            new Employee("John", "Hayes", "222-222-2222", "Hayes2John@gmail.com", "JHayes-2", "", 222, "JHayes2@company.com", "Worker"),
            new Employee("Bart", "Moore", "333-333-3333", "MooreB3@gmail.com", "BMoore-3", "", 333, "BMoore3@company.com", "Worker"),
            new Employee("Sophia", "Jones", "444-444-4444", "SJones4@gmail.com", "SJones-4", "", 444, "SJones4@company.com", "Worker"),
            new Employee("Ava", "Lopez", "555-555-5555", "AvaLpz5@gmail.com", "", "ALopez-5", 555, "ALopez5@company.com", "Manager"),
            new Employee("Emily", "Stark", "666-666-666", "Emily6Stark1@gmail.com", "EStark-6", "", 666, "EStark6@company.com", "Manager"),
        }; 

        //Encrypting fake employees private infomartion
        
            for(int i = 0; i < Fake_Employees.length; i++)
            if(Fake_Employees[i].hasPrivateInfo())
            {
                Fake_Employees[i].setEmployee_SSN("***-***-****");
            }

        //Method to print out fake employee database
        for(int i = 0; i < Fake_Employees.length; i++)
        {
            System.out.println("------");
            System.out.println("Name: " + Fake_Employees[i].getEmployee_First_Name() + " " + Fake_Employees[i].getEmployee_Last_Name());
            System.out.println("ID: " + Fake_Employees[i].getEmployee_ID());
            System.out.println("Work Email: " + Fake_Employees[i].getEmployee_Work_Email());
            System.out.println("Position: " + Fake_Employees[i].getEmployee_Position());
        }
        return Fake_Employees;  
}
}