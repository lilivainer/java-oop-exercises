package Ex10_6;
import unit4.collectionsLib.*;


public interface Movable 
{
	public String getSource(); //returns the source location of the transport
	public String getDestination(); //returns the destination of the transport
	public void move(); //swaps the source and destination of the transport
	public String getType(); //returns the type name of the transport
	public String details(); //returns details about the transport
}
