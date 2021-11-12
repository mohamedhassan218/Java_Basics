import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        Account myAccount = new Account();

        System.out.printf("The initial name is: %s%n", myAccount.getName());
        System.out.print("Please enter the name :");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in myAccount is: %s%n", myAccount.getName());
        /*While using printf, if we put %S (upper case ) the string will be in the upper case
        if we put %s (lower case ) the string will be in the lower case*/

    }
    
}
