
public class SalariedEmployee extends Employee
{
	
	private double weaklySalary;
	
	
	//constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weaklySalary)
	{
		super(firstName, lastName,socialSecurityNumber );
		
		if (weaklySalary < 0.0)
		{
			throw new IllegalArgumentException("Weakly salary must be >= 0.0");
		}
		
		this.weaklySalary = weaklySalary;
	}
	
	
	//set the weakly salary
	public void setWeaklySalary(double weaklySalary)
	{

		if (weaklySalary < 0.0)
		{
			throw new IllegalArgumentException("Weakly salary must be >= 0.0");
		}
		
		this.weaklySalary = weaklySalary;
	}
	
	
	//get the weakly salary
	public double getWeaklySalary()
	{
		return weaklySalary;
	}
	
	
	//override earnings method (required in subclasses)
	@Override 
	public double earnings()
	{
		return getWeaklySalary() ;
	}
	
	
	
	@Override
	public String toString()
	{
		return String.format("Salaried employee: %s%n%s: $%.2f", super.toString(), "weakly salary",getWeaklySalary());
	}
}//end of class
