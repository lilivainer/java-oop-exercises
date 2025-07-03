package Ex14_1;
import unit4.collectionsLib.*;

public enum EmployeeType
{
	REGULAR("Emp regular"),
	UNION("Emp in Union"),
	TECHNICIAN("Emp Tech"),
	SUPERVISOR("Emp Super");
	
	private final String Description;
	
	//ctor
	EmployeeType(String description)
		{
	        this.Description = description;
	    }
		
		//get description
		public String getDescription() 
		{
	        return this.Description;
	    }
	}


