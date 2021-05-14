/**
   The InvalidHoursException class checks if the employee hours given is
   valid or not. Negative numbers and anything greater than 84 is invalid.

   	@author Jeremy Hill
    @version 1.8.0_271
*/
class InvalidHoursException extends Exception
{
	InvalidHoursException()
	{
		super("Negative numbers and anything greater than 84 is invalid");
	}

	InvalidHoursException(double givenHours)
	{
		super("Negative numbers and anything greater than 84 is invalid" + givenHours);
	}
}