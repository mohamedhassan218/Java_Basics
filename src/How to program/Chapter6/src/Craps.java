import java.security.SecureRandom;
public class Craps 
{
	//create secure random number generator for use in method rollDice:
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	//enum type with constants that represent the game status:
	private enum Status {CONTINUE, WON, LOST};
	
	//constants represent the common rolls of the dice:
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	
	public static void main(String[] args)
	{
		int myPoints = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
		case SEVEN: 	//win with 7
		case YO_LEVEN:	//win with 11
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES://lose with 2
		case TREY:		//lose with 3
		case BOX_CARS:	//lose with 12
			gameStatus = Status.LOST;
			break;
		default:		//don't win or lose, the game is not over
				gameStatus = Status.CONTINUE;
				myPoints = sumOfDice;
				System.out.printf("The points is %d%n", myPoints);
				break;
		}
		
		//while the game isn't complete:
		while(gameStatus == Status.CONTINUE)
		{
			sumOfDice = rollDice();
			if(sumOfDice == myPoints)
				gameStatus = Status.WON;
			else
				{if(sumOfDice == SEVEN)
					gameStatus = Status.LOST;}
		}
		
		if(gameStatus == Status.WON)
			System.out.println("Player won");
		else
			System.out.println("Player lost");
		
	}
	
	
	
	
	
	
	public static int rollDice()
	{
		//it generate random numbers between 1 and 6 
		//note 1 + 
		int die1 = 1 + randomNumbers.nextInt(6);//first die roll:
		int die2 = 1 + randomNumbers.nextInt(6);//second die roll:
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		return sum;
	}
}
