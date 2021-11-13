import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        
        /*Scanner input = new Scanner (System.in);

        Account myAccount = new Account();

        System.out.printf("The initial name is: %s%n", myAccount.getName());
        System.out.print("Please enter the name :");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in myAccount is: %s%n", myAccount.getName());*/

        /*While using printf, if we put %S (upper case ) the string will be in the upper case
        if we put %s (lower case ) the string will be in the lower case*/

        //create two account object
        Account account1 = new Account("Mohamed Hassan" , 50.00);
        Account account2 = new Account("Mohamed Salah" , -7.53);
        
        //Display initial value for name and balance in each object
        
        System.out.printf("account1 balance is: %s%n" , account1.getBalance());
        System.out.printf("account2 balance is: %s%n" , account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposite amount for account1: ");
        double depositeAmount = input.nextDouble();
        account1.deposite(depositeAmount);

        System.out.print("Enter deposite amount for account2: ");
        depositeAmount = input.nextDouble();
        account2.deposite(depositeAmount);

        //Final display
        System.out.printf("account1:-  the name: %s , the final balance: %.2f . %n" , account1.getName() ,account1.getBalance());
        System.out.printf("account2:-  the name: %s , the final balance: %.2f . %n" , account2.getName() ,account2.getBalance());













        


    }
    
}
