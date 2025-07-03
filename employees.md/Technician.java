package Ex14_1;
import unit4.collectionsLib.*;

public class Technician extends Employee {

	private int numComputers; //number of computers the employee is responsible for
	
	public Technician(String name, int yearsOfSeniority, int numComputers) 
	{
		super(name, yearsOfSeniority, EmployeeType.TECHNICIAN);
		this.numComputers = numComputers;
	}
	 
	@Override
	public double calculateSalary() 
	{
	    int count = this.numComputers / 10;
	    return super.calculateSalary() + ((double) count * 250);
	}
	
	public int getNumComputers()
	{
		return this.numComputers;
	}

	public int getVoteScore()
	{
		return 23;
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}

}
