package Ex10_6;
import unit4.collectionsLib.*;


public abstract class Vehicle implements Movable, Comparable<Object> {
    private int id; //vehicle ID number 
    private String source; //origin point
    private String destination; //destination point

    public Vehicle(int id, String Source, String Destination)
    {
        this.id = id;
        this.source = Source;
        this.destination = Destination;
    }

    @Override
    public String getSource() 
    {
        return this.source;
    }

    @Override
    public String getDestination() 
    {
        return this.destination;
    }

    public void move() //swaps the origin and destination of the vehicle
    {
        String temp = this.source;
        this.source = this.destination;
        this.destination = temp;
    }

    @Override
    public abstract String getType();

    @Override
    public String details() 
    {
        String details = "Movable Type: ";

        if (this instanceof Plane)
            details += "Plane";

        if (this instanceof Train)
            details += "Train";

        details += "\nNumber " + this.id +
                   "\nSource= " + this.source +
                   "\nDestination= " + this.destination;
        return details;
    }

    @Override
    public abstract int compareTo(Object o);
}
