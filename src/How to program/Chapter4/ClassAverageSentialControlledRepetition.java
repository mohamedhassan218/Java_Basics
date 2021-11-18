import java.util.Scanner;
public class ClassAverageSentialControlledRepetition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ///////////////Initialization phase
        int total =0;
        int gradeCounter = 0;

        //////////////Proccesing phase
        System.out.print("Enter the grade or enter -1 to quit:");
        int grade = input.nextInt();
        
        while (grade != -1)
        {
            total += grade;
            gradeCounter++;

            System.out.print("Enter the grade or enter -1 to quit:");
            grade = input.nextInt();
        }


        //////////////////////Transimission phase
        if (gradeCounter != 0)
        {
            //Use number with decimal point 
            double average = (double) total / gradeCounter;

            System.out.printf("%n Total of %d grades entered is: %d%n ",gradeCounter,total);
            System.out.printf("Class average is %.2f%n" , average);
        }
        else            //no grades were entered
        {
            System.out.println("No grades entered!!");
        }
    }//End of main
}//End of class
