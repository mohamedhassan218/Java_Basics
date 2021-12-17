/**
 * CommissionEmployeeTest
 */
public class CommissionEmployeeTest {

    public static void main(String[] args) {

        //instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Sue","Jones","222-22-2222",10000,.06);


        //get commission employee data
        Sysetm.out.println("Employee's information obtained by the get methods: ");
        System.out.printf("%n%s %s%n" , "First name is:",employee.getFirstName());
        System.out.printf("%s %s%n" , "Last name is:",employee.getLastName());
        System.out.printf("%s %s%n" , "Social security number is:",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n" , "Gross sales is:",employee.getGrossSales());
        System.out.printf("%s %.2f%N" , "Commission rate is:",employee.getCommissionRate());


        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

        
        System.out.printf("%n%s: %s%n%n" ,"Updated employee information obtained by toString", employee );

        

    }//end of main method
}//end of the class