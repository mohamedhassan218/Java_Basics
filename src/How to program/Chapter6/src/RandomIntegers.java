import java.security.SecureRandom;
public class RandomIntegers 
{
	public static void main(String[] args)
	{
		//Note:
		//we call the static method without the class name 
		//because main method in the same class of the static methods
		randomNumbersMethod(20);
	}

	//method generate random numbers:
	public static void randomNumbersMethod(int number)
	{
		SecureRandom secureRandom = new SecureRandom();
		for(int i = 1; i <= number; i++)
		{
			//pick random integer from one to 9
			int temp = secureRandom.nextInt(10);
			System.out.printf("%d ", temp);
			//to print new line after each 5 numbers
			if(i % 5 == 0)
				System.out.println();
		}
	}
}
