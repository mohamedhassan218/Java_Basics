import java.util.Scanner;
public class Comparision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 ;
        int number2 ;

        System.out.print("Enter the first integer:"); //prompt
        number1 = input.nextInt();
        System.out.print("Enter the seconed integer: "); //prompt
        number2 = input.nextInt();

        if (number1 == number2)
        {
            System.out.printf("%d = %d%n" , number1 ,number2);
        }
        if (number1 < number2)
        {
            System.out.printf("%d < %d%n" , number1 ,number2);
        }
        if (number1 > number2)
        {
            System.out.printf("%d > %d%n" ,number1 ,number2);
        }
        if (number1 != number2)
        {
            System.out.printf("%d != %d%n" ,number1 ,number2);
        }
        if (number1 <= number2)
        {
            System.out.printf("%d <= %d%n" ,number1 ,number2);
        }
        if (number1 >= number2)
        {
            System.out.printf("%d >= %d%n" ,number1 ,number2);
        }


    }
    
}
