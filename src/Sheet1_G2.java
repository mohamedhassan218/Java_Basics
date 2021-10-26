import java.util.Scanner ;
import java.util.Random; 
public class Sheet1_G2 {

	public static void main(String[] args) {
		
		// 1
		/*String Name ;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name!");
		Name = input.nextLine() ;
		System.out.println("Hello " + Name ); */
//****************************************************************
		
		//22
		/*int xCor ;
		int yCor ;
		System.out.println("Please enter the coordinates : ");
		Scanner input = new Scanner(System.in);
		xCor = input.nextInt();
		yCor = input.nextInt();
		if (xCor >= 2 && xCor <=45)
		{
			if (yCor >= 25 && yCor <= 50)
			{
				System.out.println("The ball is above the line !");
			}
			else 
			{
				System.out.println("IS NOT ABOVE THE LINE @@@");
			}
		}
		else 
		{
			System.out.println("IS NOT ABOVE THE LINE @@@");
		}*/
//*******************************************************************
		
		//333
		Scanner input = new Scanner(System.in);
		double number1 ;
		double number2 ;
		System.out.println("Hi, What is the sum of this two integers ?!");
		Random rand = new Random();
		number1 = rand.nextDouble()*10;
		number2 = rand.nextDouble()*10;
		number1 = (int)number1;
		number2 = (int)number2;
		System.out.println(number1 + "  \t " + number2 );
		double sumOfTheKid = input.nextInt();
		double realSum = number1 + number2 ;
		if (realSum == sumOfTheKid)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Not correct!");
		}
		
		
		
//*********************************************************************
		
		//4444
		/*boolean ch1 ;
		boolean ch2 ;
		System.out.println("Please enter A then B to show you the truth table of them!");
		Scanner input = new Scanner(System.in);
		ch1 = input.nextBoolean();
		ch2 = input.nextBoolean();
		
		System.out.println("A and B is: " + (ch1 & ch2));
		System.out.println("A or B is: " + (ch1 | ch2));
		System.out.println("A xor B is: " + (ch1 ^ ch2));*/
		
//*********************************************************************
		
		//55555
		
		/*char C ='A';
		int ASCII =  C;
		for (int i =1 ; i <9 ;i++)
		{
			
	        System.out.println(ASCII);            //Automatic casting
		    ASCII ++ ;
		}*/
		
		/*char C = 'A' ;
		int ASCII = (int) C ;
		for (int i =1 ; i <9 ;i++)
		{	
	        System.out.println(ASCII);           //Manual casting 
		    ASCII ++ ;
		}*/
		
//**********************************************************************
		
		//666666
		/*Scanner input = new Scanner(System.in);
		System.out.println("Hi, please enter three integers !");
		int a = 0;
		int b = 0;
		int c = 0;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		int biggest =0;
		int bigger =0;
		int small =0;
		if (a > b)
		{
			if (a > c)
			{
				biggest =a;
				if (b > c)
				{
					bigger = b;
					small = c;
				}
				else
				{
					bigger = c;
					small = b;
				}
			}
			else
			{
				biggest = c;
				bigger = a;
				small = b;
			}
		}
		else
		{
			if (b > c)
			{
				biggest = b;
				if (c > a)
				{
					bigger = c;
					small =a;
				}
				else
				{
					bigger = a;
					small =c;
				}
			}
			else
			{
				biggest = c;
				bigger = b;
				small = a;
			}
		}
		
		System.out.println(small);
		System.out.println(bigger);
		System.out.println(biggest);*/

//*******************************************************************
		
	}


}
