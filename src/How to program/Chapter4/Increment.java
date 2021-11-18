public class Increment {
    public static void main(String[] args) {
        
        int c = 5 ;
        //demonstrate postfix increment operator
        System.out.printf("C before postincrement: %d%n", c);
        System.out.printf("postincrementing: %d%n", c++);
        System.out.printf("C after postincrement: %d%n", c);
        
        System.out.println("***************************************");

        c = 5 ;
        //demonstrate prefix increment operator
        System.out.printf("C before preincrement: %d%n", c);
        System.out.printf("preincrementing: %d%n", ++c);
        System.out.printf("C after preincrement: %d%n", c);

    }//end of main
}//end of class
