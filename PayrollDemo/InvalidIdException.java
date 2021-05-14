/**
   The InvalidIdException class checks if the employee id given
   is valid or not. Zero or negative numbers are invalid.

   	@author Jeremy Hill
    @version 1.8.0_271
*/
class InvalidIdException extends Exception
{
	InvalidIdException()
	{
		super("Zero or negative numbers are invalid");
	}

	InvalidIdException(double givenId)
	{
		super("Zero or negative numbers are invalid" + givenId);
	}
}