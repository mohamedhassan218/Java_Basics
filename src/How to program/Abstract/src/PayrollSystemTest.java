import java.util.Currency;

public class PayrollSystemTest 
{

	public static void main(String[] args) 
	{
		//create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("Johne", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karin", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		BasePlusCommssionEmployee basePlusCommissionEmployee = new BasePlusCommssionEmployee("Bob","Lewis", "444-44-4444",5000, .04, 300);
		
		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings());
		
		//create four element Employee array
		Employee[] employees = new Employee[4];
		
		//initialize array with employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		//generally process each element in array employees
		for (Employee currentEmployee : employees)
		{
			System.out.println(currentEmployee);     // invokes toString
			
		    if (currentEmployee instanceof BasePlusCommssionEmployee)
			{
		    	BasePlusCommssionEmployee employee = (BasePlusCommssionEmployee) currentEmployee;
		    	employee.setBaseSalary(1.10 * employee.getBaseSalary());
		    	System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
				
			}//end of if statement
		    System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			
		}//end of for
		
		//get type name of each object in employees array
		for (int j = 0; j < employees.length; j++)
		{
			System.out.printf("Employee %d is a %s%n" , j, employees[j].getClass().getName());
		}

	}//end of main

}//end of class test
