package CHAPTER3DITEL;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee (String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName (){
        return firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getLastName (){
        return lastName;
    }
    public void setSalary (double salary){
        this.salary = salary;
    }
    public double getSalary (){
        if (salary > 0.0);
        return salary;
    }
    public void increaseSalary(){
        double salaryPercent = salary / 10.0;
        if (salaryPercent > 0.0)
            salary = salary + salaryPercent;

    }
}
