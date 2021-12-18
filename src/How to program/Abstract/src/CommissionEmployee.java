public class CommissionEmployee extends Employee {
    
    
    private double grossSales ;           //gross weakly sales
    private double commissionRate;        //commission precentage

    //my constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
    	super(firstName, lastName, socialSecurityNumber);
        //if gross sale is invalid throw exeption
        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        //if commision rate is invalid throw exeption
        if (commissionRate <= 0.0 || commissionRate >= 1)
        {
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
        }

        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end of constructor


    

    // set gross sales
    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    //return gross sales
    public double getGrossSales()
    {
        return grossSales;
    }

    
    // set commission rate
    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate  <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    //return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    }

    //override earnings
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales() ;
    }

    //return string representation of CommissionEmployee object
    @Override   //indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "Commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
   
}//end of class  