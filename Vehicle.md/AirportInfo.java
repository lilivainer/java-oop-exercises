package Ex10_6;
import unit4.collectionsLib.*;

public class AirportInfo {

    //Sorts an array of Comparable objects using their compareTo method (Bubble Sort)
    public static void sortTransport(Comparable[] transport) 
    {
        for (int i = 0; i < transport.length - 1; i++) 
            for (int j = 0; j < transport.length - 1 - i; j++) 
                if (transport[j].compareTo(transport[j + 1]) > 0) 
                {
                    Comparable temp = transport[j];
                    transport[j] = transport[j + 1];
                    transport[j + 1] = temp;
                }
    }
    
    //Returns reports of all Movable objects passed to it (see output format in test file)
    public static String reportAll(Movable[] movable) 
    {
        String report = "";
        for (int i = 0; i < movable.length; i++) 
            report += movable[i].details() + "\n------\n";
        
        return report;
    }
}
