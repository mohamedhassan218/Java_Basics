import java.util.ArrayList;
import java.util.Scanner;
public class Q17 {

    public static void main(String[] args) {
        
        ArrayList<String> namesOfStudents = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        String studentName = " ";
        
        while(studentName != "stop")
        {
            System.out.println("Enter name or stop !");
            studentName = input.nextLine();
            namesOfStudents.add(studentName); 
        }
        
    }

    
}
