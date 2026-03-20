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

    public static void main(String[] args) throws Exception{
        System.out.println("----------------------\n");
        //Scanner scanner = new Scanner(System.in);
        //scanner.close();
        System.out.println("\n----------------------");
    }
}