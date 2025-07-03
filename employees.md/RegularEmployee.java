package Ex14_1;
import unit4.collectionsLib.*;

public class RegularEmployee extends Employee {

	public RegularEmployee(String name,int yearsOfSeniority)
	{
		super(name,yearsOfSeniority,EmployeeType.REGULAR);
	}
	
	@Override
    public double calculateSalary()
    {
		return super.calculateSalary();
    }
	
	public int getVoteScore()
	{
		return 10;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
