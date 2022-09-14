public class Scope 
{
	private static int x = 1;
	
	public static void main(String[] args)
	{
		int x = 5;
		System.out.printf("Local x in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("Local x in main is %d%n", x);

	}
	
	//here, we create a local variable that is declared and initiated 
	// every time we call the method.
	public static void useLocalVariable()
	{
		int x = 25;
		System.out.printf("Local x on entering method useLocalVariable is %d%n", x);
		x++; //26
		System.out.printf("Local x before exiting method useLocalVariable is %d%n", x);
	}

	
	//here, we change the value of the static variable x 
	//so it changes on every time we call the method
	public static void useField()
	{
		System.out.printf("Field x on entering method useField is %d%n", x);
		x *= 10;
		System.out.printf("Field x before exiting method useField is %d%n", x);
	}
}
