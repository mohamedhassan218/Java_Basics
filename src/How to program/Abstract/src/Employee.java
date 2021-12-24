//Employee abstract superclass
public abstract class Employee implements Payable
{
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	
	//My own constructor
	public Employee (String firstName,String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	//return first name
	public String getFirstName()
	{
		return firstName;
	}
	
	
	//return last name
	public String getLastName()
	{
		return lastName;
	}
	
	
	//return SSN
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	
	@Override
	//return String representation of Employee object
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", getFirstName(),getLastName(), getSocialSecurityNumber());
	}
	
	
	//Note: we don't implement Payable method getPaymentAmount here so
	//this class must be declared abstract to void compilation error.
	
}//end of class
