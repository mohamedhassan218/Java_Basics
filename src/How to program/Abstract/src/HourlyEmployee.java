
public class HourlyEmployee extends Employee
{

	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0)
		{
			throw new IllegalArgumentException("Wage must be >= 0.0");
		}
		
		if (hours < 0.0)
		{
			throw new IllegalArgumentException("Hours must be >= 0.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	}
	
	//set wage
	public void setWage(double wage)
	{
		if (wage < 0.0)
		{
			throw new IllegalArgumentException("Wage must be >= 0.0");
		}
		
		this.wage = wage;	
	}
	
	//get wage 
	public double getWage()
	{
		return wage;
	}
	
	//set hours
	public void setHours(double hours)
	{
		if (hours < 0.0 || hours > 168.0)             //168 the total of weak days
		{
			throw new IllegalArgumentException("Hours must be >= 0.0");
		}
		
		this.hours = hours;
	}
	
	
	//get hours
	public double getHours()
	{
		return hours;
	}
	
	
	//override abstract method earnings
	@Override
	public double getPaymentAmount()
	{
		if (getHours() <= 40)
		{
			return getWage() * getHours();
		}
		else 
		{
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5; 
		}
	}
	
	
	//override toString method
	@Override
	public String toString()
	{
		return String.format("Hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
	}
	
}//End of class










