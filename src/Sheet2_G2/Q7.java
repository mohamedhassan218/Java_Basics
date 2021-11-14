import java.util.Scanner;
public class Q7
{
    public static void main (String[] args)
    {
		/*String number ;
		int sum =0, product =1;
		boolean swi = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Hi user, enter integers to continue or enter 'q' to quit!");
		number = input.nextLine();
		
		if (number == "q")
		{
			System.out.println("you ended it before entering at least one value!!!");
		}

	
		while (swi)
		{
			while (number != "q")
			{
			    sum += Integer.valueOf(number);
			    product *=  Integer.valueOf(number);
			    number = input.nextLine();
			}
			swi = false;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);*/


		String choice = "";
        int sum = 0;
        int product = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(!choice.equals("q")){
            System.out.println("Enter a number or q to quit");
            choice = input.next();

            if(!choice.equals("q")){
            int number = Integer.parseInt(choice);
            sum = sum+number;
            product = product*number;
            count++;
            }
        } 
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);

    }
    
}
