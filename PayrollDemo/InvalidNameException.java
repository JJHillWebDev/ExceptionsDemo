/**
   The InvalidNameException class checks if the employee
   name given is an empty string or not.

   	@author Jeremy Hill
    @version 1.8.0_271
*/
class InvalidNameException extends Exception
{
	InvalidNameException()
	{
		super("Employee name cannot be left blank");
	}

	InvalidNameException(String givenName)
	{
		super("Employee name cannot be left blank" + givenName);
	}
}