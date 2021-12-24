
public class Invoice implements Payable
{
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
	{
		if(quantity < 0)         // validate the quantity
		{
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
		
		if(pricePerItem < 0.0)    // validate the price per item
		{
			throw new IllegalArgumentException("Price per item must be >= 0");
		}
		
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		this.partDescription = partDescription;
		this.partNumber = partNumber;
	}// end of constructor
	
	//return part number
	public String getPartNumber()
	{
		return partNumber;
				
	}
  
	//return part description
	public String getPartDescription()
	{
		return partDescription;
	}
	
	// set the quantity
	public void setQuantity(int quantity)
	{
		if(quantity < 0)         // validate the quantity
		{
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
		this.quantity = quantity;
	}
	
	//return the quantity
	public int getQuantity()
	{
		return quantity;
	}
	
	//set the price per item
	public void setPricePerItem(double pricePerItem)
	{
		if(pricePerItem < 0.0)    // validate the price per item
		{
			throw new IllegalArgumentException("Price per item must be >= 0");
		}
		this.pricePerItem = pricePerItem;
	}
	
	//return the price per item
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	
	//return string representation to invoice object
	@Override
	public String toString()
	{
		return String.format("%s: %n%s: %s%n%s: %s%n%s: %d%n%s: $%,.2f", "Invoice", "Part number", getPartNumber(), "Part description", getPartDescription(), "Quantity", getQuantity(), "Price per item", getPricePerItem());
		
	}
	
	//overriding the method in the interface in the class that implement it (required or make the class abstract)
	@Override
	public double getPaymentAmount()  
	{
		return getQuantity() * getPricePerItem();   //calculate total cost
	}
}//end of class invoice 
