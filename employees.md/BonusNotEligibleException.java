package Ex14_1;
import unit4.collectionsLib.*;

public class BonusNotEligibleException extends Exception {

	public BonusNotEligibleException()
	{
       super("BonusNotEligibleException");
	}

	/*public BonusNotEligibleException(String message) //custom error message
	{
        super(message);
    }*/
}
