package Ex14_1;
import unit4.collectionsLib.*;

public class Company {

	private Employee[] employees; //employee array
	private final int EMPLOYEES_MAX=100; //maximum number of employees in the company
	private static int currentEmployeeCount; //current number of employees

	public Company()
	{
		this.employees = new Employee[EMPLOYEES_MAX];
	}
	 
	//add new employee
	public boolean addEmployee(Employee e)
	{
		if(this.currentEmployeeCount < 100)
		{
			this.employees[this.currentEmployeeCount] = e;
			this.currentEmployeeCount++;
			return true;
		}
		return false;
	}
	
	//calculate total salary of all employees in the company
	public double getTotalMonthlySalary()
	{
		double count =0;
		for(int i=0 ; i <this.currentEmployeeCount ; i++)
		{
			count += this.employees[i].calculateSalary();
		}
		return count;
	}
	
	//rename suggestion is accepted if the vote sum of RegularEmployee and Technician
	//is greater than the vote sum of the other employees (UnionMember and ProjectSupervisor are considered against)
	public boolean isCompanyRenameAccepted(Votable[] voters)
	{
	   int Pros =0; //for - RegularEmployee and Technician
	   int Cons =0; //against - UnionMember and ProjectSupervisor
	   
	   for(int i=0 ; i <this.currentEmployeeCount ; i++)
		{
			if(this.employees[i] instanceof RegularEmployee  
			   || 
			   this.employees[i] instanceof Technician)
				Pros += this.employees[i].getVoteScore();
			else
				if(this.employees[i] instanceof UnionMember  
						|| 
				   this.employees[i] instanceof ProjectSupervisor)
					Cons += this.employees[i].getVoteScore();	
		}
	   
	   return Pros>Cons ;
	}
	
	//check if the employee is eligible for annual bonus, conditions:
	//only for RegularEmployee and Technician
	//condition: more than 5 years seniority, and Technician must be responsible for over 100 computers
	public boolean isEligibleForBonus(Employee e) 
	{
	    try 
	    {
	        if (e instanceof RegularEmployee || e instanceof Technician) 
	        {
	            if (e.getYearsOfSeniority() > 5)
	            {
	                if (e instanceof Technician)
	                {
	                    if (((Technician) e).getNumComputers() > 100) 
	                        return true;
	                    else 
	                        throw new BonusNotEligibleException();
	                }
	                return true; // RegularEmployee with more than 5 years
	            } 
	            else 
	                throw new BonusNotEligibleException();
	        } 
	        else 
	            throw new BonusNotEligibleException();
	    }
	    catch (BonusNotEligibleException ex) 
	    {
	        System.out.println(ex.getMessage());
	        return false;
	    }
	}
	
}
