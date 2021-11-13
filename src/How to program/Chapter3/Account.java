public class Account {
    // instance variable
    private String name;
    private double balance;

    //constructor initializes name
    public Account(String name , double balance) //Constructor's name is the class name
    {
        this.name = name;

        if (balance > 0.0)
        {
            this.balance = balance;
        }
    }

    public void  setName(String name)
    {
        this.name = name;        //method to set the name
    }
    
    
    public String getName()
    {
        return name;            //method to get the name
    }

    public void deposite(double depositeAmount)
    {
        if (depositeAmount > 0.0)
        {
            balance += depositeAmount;
        }
    }
    public double getBalance()
    {
        return balance;
    }

}//end of class
