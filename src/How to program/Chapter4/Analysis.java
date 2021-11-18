import java.util.Scanner;
public class Analysis {
    public static void main(String[] args) {
        //////////////Create Scanner object
        Scanner input = new Scanner(System.in);

        //////////Inititalizing variables in decleration 
        int passes =0;
        int failures =0;
        int studentCounter =1;

        /////////Using counter-controlled loop 
        while (studentCounter<=10)
        {
            System.out.print("Enter the result (1 = pass , 0 = fail)");
            int result = input.nextInt();

            ///////if .. else is nested in while loop
            if (result == 1)
            {
                passes++;
            }
            else 
            {
                failures ++;
            }
            studentCounter++;
        }

        ///////////Termination phase
        System.out.printf("%nPassed: %d%nFailed: %d%n" , passes,failures);

        if (passes >8)
        {
            System.out.println("Bouns to instructor!");
        }
    }/////////end of main
}//////end of class 
