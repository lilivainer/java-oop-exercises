package Ex14_1;
import unit4.collectionsLib.*;

public class ProjectSupervisor extends Employee {
    private Employee[] team; //array of 15 employees of different types
    private final int MAX = 15;
    
    public ProjectSupervisor(String name, int yearsOfSeniority, Employee[] team) 
    {
        super(name, yearsOfSeniority, EmployeeType.SUPERVISOR);
        this.team = new Employee[MAX];
        for (int i = 0; i < team.length && i < MAX; i++) //create a copy
        {
            this.team[i] = team[i];
        }
    }
    
    @Override
    public double calculateSalary() 
    {
        int count = 0;
        for (int i = 0; i < this.team.length; i++)
            if (this.team[i] instanceof Technician)
                count += 100;
            else if (this.team[i] instanceof UnionMember)
                count += 50;
    
        return super.calculateSalary() + count;
    }
    
    public int getVoteScore() 
    {
        return 12;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
