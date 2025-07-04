package Ex10_6;
import unit4.collectionsLib.*;


public class Plane extends Vehicle {

	private int height; //maximum flight altitude (integer)

	public Plane(String originPoint, String finalPoint, int id, int height) 
	{
		super(id, originPoint, finalPoint);
		this.height = height;
	}

	public String getType() //returns the type name of the transport
	{
		return "Plane";
	}

	@Override
	public int compareTo(Object o)
	{
	    if (o instanceof Plane) {
	        Plane p = (Plane) o;
	        return Integer.compare(this.height, p.height);
	    }
	    return 0; 
	}

	@Override
	public String details()
	{
		return super.details() + "\nMax altitude: " + this.height;
	}
}
