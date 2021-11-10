import java.util.Scanner;
public class Q7
{
    public static void main (String[] args)
    {
		String number ;
		int sum =0, product =1;
		Scanner input = new Scanner(System.in);
		System.out.println("Hi user, enter integers to continue or enter 'q' to quit!");
		number = input.next();
		if (number == "q")
		{
			System.out.println("The sum is " + sum);
			System.out.println("The product is " + product);
		}
		else
		{
			while (number != "q")
			{
				sum += (int) number;
				product *=  (int) number;
			}
			System.out.println("The sum is " + sum);
			System.out.println("The product is " + product);

		}


    }
    
}
