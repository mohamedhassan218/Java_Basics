import java.util.Scanner;
public class MaximumFinder
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three doubles :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.printf("The maximum number is: %2f", maximum(x, y, z));
		//Note: we call the method without taking any instance of the class
		//we also called it without using the class name because
		//main method is in the same class
	}
	
	//create a static methods to get the maximum double of 3 numbers:
	public static double maximum(double a, double b, double c)
	{
		double maxi = a;
		if(b > a)
			maxi = b;
		if(c > maxi)
			maxi = c;
		return maxi;
		
		//instead of the code above, U can replace it with this line:
		//return Math.max(a, Math.max(b, c));
	}
	

}
