public class MethodOverload 
{
	public static void main(String[] args)
	{
		int intNumber = 5;
		double doubleNumber = 7.5;
		System.out.println(square(intNumber));
		System.out.println(square(doubleNumber));
	}
	
	public static int square(int N)
	{
		return N*N;
	}
	
	//same name but different data type for parameters and different return type.
	public static double square(double N)
	{
		return N*N;
	}
	
}
