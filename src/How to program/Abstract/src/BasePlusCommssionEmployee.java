public class BasePlusCommssionEmployee extends CommissionEmployee
{
    private double baseSalary;    //base salary per weak

    public BasePlusCommssionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
    {

        //explicit call to superclass constructor
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);

        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0!");
        }

        this.baseSalary = baseSalary;
    } //end of constructor

    
    //Method to set base salary
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary <0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0!");
        }
        this.baseSalary = baseSalary;
    }



    //method to get base salary
    public double getBaseSalary()
    {
        return baseSalary;
    }



    @Override
    public double getPaymentAmount()
    {
        //now can be accessed after making them protected in the superclass
        return getBaseSalary() + super.getPaymentAmount() ;
    }

    @Override
    public String toString()
    {

        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}//end of class 






