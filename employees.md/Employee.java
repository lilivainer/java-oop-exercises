package Ex14_1;
import unit4.collectionsLib.*;

public abstract class Employee implements Salaried, Votable {
    private String name; //employee name
    private int yearsOfSeniority; //years of seniority
    private EmployeeType type; //employee type from the ENUM options

    public Employee(String name, int yearsOfSeniority, EmployeeType type) 
    {
        this.name = name;
        this.yearsOfSeniority = yearsOfSeniority;
        this.type = type;
    }

    //methods defined in Salaried and Votable interfaces
    //methods that must be implemented in derived classes
    public abstract int getVoteScore(); //abstract method with no implementation

    public double calculateSalary() //base salary method for all employees
    //                                in some subclasses it will be extended with bonuses
    {
        return 8000 + (this.yearsOfSeniority * 500);
    }

    public int getYearsOfSeniority() {
        return yearsOfSeniority;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type.getDescription() +
               ", Years: " + this.yearsOfSeniority;
    }
}
