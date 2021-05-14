/**
   The InvalidRateException class checks if the employee rate given is valid
   or not. Negative numbers and anything greater than 25 is invalid.

   	@author Jeremy Hill
    @version 1.8.0_271
*/
class InvalidRateException extends Exception
{
	InvalidRateException()
	{
		super("Negative numbers and anything greater than 25 is invalid");
	}
	
	InvalidRateException(double givenRate)
	{
		super("Negative numbers and anything greater than 25 is invalid" + givenRate);
	}
}