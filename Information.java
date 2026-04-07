//import java.util.Scanner;

public class Information extends CenterHub{
    private String Company_Name;
    private String Company_Type;
    private String Location;
    private String Founder;
    private String Founded_Date;
    private int Total_Numbers_Employees;

    //no arg contructor
    public Information(){}
    //loaded contructor
    public Information(String company_name, String company_type, String location, String founder, String founded_date, int nums_of_employees){
            this.Company_Name = company_name;
            this.Company_Type = company_type;
            this.Location = location;
            this.Founder = founder;
            this.Founded_Date = founded_date;
            this.Total_Numbers_Employees = nums_of_employees;
        }
    //Set and Get methods
    public void setCompany_Name(String company_name)
        {
            this.Company_Name = company_name;
        }
    public String getCompany_Name()
        {
            return this.Company_Name;
        }
    public void setCompany_Type(String company_type)
        {
            this.Company_Type = company_type;
        }
    public String getCompany_Type()
        {
            return Company_Type;
        }
    public void setLocation(String location)
        {
            this.Location = location;
        }
    public String getLocation()
        {
            return this.Location;
        }
    public void setFounder(String founder)
        {
            this.Founder = founder;
        }
    public String getFounder()
        {
            return this.Founder;
        }
    public void setFounded_date(String founded_date)
        {
            this.Founded_Date = founded_date;
        }
    public String getFounded_Date()
        {
            return this.Founded_Date;
        }
    public void setTotal_Numbers_Employees(int nums_of_employees)
        {
            this.Total_Numbers_Employees = nums_of_employees;
        }
    public int getTotal_Numbers_Employees()
        {
            return this.Total_Numbers_Employees;
        }
    //ToString method
    @Override
    public String toString() 
        {
            return "\n- Warehouse Infomartion -\n\n"
            + "Company: " + this.getCompany_Name()
            + "\nCompany Type: " + this.getCompany_Type()
            + "\nLocation: " + this.getLocation()
            + "\nFounder: " + this.getFounder()
            + "\nFounded Date: " + this.getFounded_Date()
            + "\nNumbers of Employees: " + this.getTotal_Numbers_Employees()
            + "\n";
            //Information printInfo = new Information("Cooper & Rocco's Warehouse", "Private", "123 Street", "Jeffrey Cruz", "2026", 100);
        }
}