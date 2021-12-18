//Employee abstract superclass
public abstract class Employee 
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
	public String getsocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	
	@Override
	//return String representation of Employee object
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", getFirstName(),getLastName(), getsocialSecurityNumber());
	}
	
	
	//abstract method must be overriden by concrete subclasses
	public abstract double earnings();     //no implementation here
}//end of class
