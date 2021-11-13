import javax.swing.JOptionPane;
public class NameDialog {
    public static void main(String[] args) {
        //Prompt user to enter his name
        String name = JOptionPane.showInputDialog("Whats your name?");

        //Create the message
        String message = String.format("Welcome %s , on java GUI environment", name);

        //Show the message
        JOptionPane.showMessageDialog(null, message);

        
    }//end of the main 
    
}//end of the class
