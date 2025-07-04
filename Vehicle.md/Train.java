package Ex10_6;
import unit4.collectionsLib.*;


public class Train extends Vehicle {
	private int maxPas; //maximum number of passengers (integer)
	
	public Train(String originPoint, String finalPoint, int id, int maxPas) 
	{
		super(id, originPoint, finalPoint);
		this.maxPas = maxPas;
	}
	
	public String getType() //returns the type name of the transport
	{
		return "Train";
	}
	
	@Override
	public int compareTo(Object o) 
	{
		if (o instanceof Train) {
			if (this.maxPas > ((Train) o).maxPas) //downcasting to compare passenger capacity
				return 1;
			if (this.maxPas == ((Train) o).maxPas) //downcasting to compare passenger capacity
				return 0;
		}
		return -1;
	}

	@Override
	public String details() 
	{
		return super.details() + "\nPassengers: " + this.maxPas;
	}
}
