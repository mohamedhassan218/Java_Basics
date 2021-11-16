import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int gradeCounter = 1;
        int total = 0;

        while (gradeCounter <= 10)
        {
            System.out.print("Please enter the grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter ++;
        }

        int average = total /10;
        System.out.printf("Total of all grades: %d%n", total);
        System.out.printf("Average of all grades: %d%n", average);
    }
    
}
