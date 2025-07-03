package Ex14_1;
import unit4.collectionsLib.*;

public class UnionMember extends Employee {

	private int yearsAsUnionMember; //number of years the employee is a union member
	
	public UnionMember(String name, int yearsOfSeniority, int yearsAsUnionMember) 
	{
		super(name, yearsOfSeniority, EmployeeType.UNION);
		this.yearsAsUnionMember = yearsAsUnionMember;
	}
	
	@Override
    public double calculateSalary() 
	{
		return super.calculateSalary();
    }
	
	public int getVoteScore() 
	{
		return 24;
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}

}
