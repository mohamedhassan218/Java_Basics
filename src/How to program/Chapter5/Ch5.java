public class Ch5 {
    
    
    ///////////////////==> loops <==\\\\\\\\\\\\\\\\\\\\\\\

    public static void main(String[] args) {



        int counter = 1;          //using while loop
        while (counter <= 10)
        {
            System.out.println(counter);
            counter++;
            
        }

        //*******************************************************
        
        
        for (int i =1; i<=10;i++) //using for loop
	    {
	        System.out.println(i);
	    }

        //******************************************************** 

        //sum of even numbers between 0 to 20

        int total =0;
        for (int number =2 ; number <=20 ; number+=2)
        {
            total+=number;
        }
        System.out.printf("total is:%d%n" , total);

        //******************************************************** 

        int counter45 = 0;
	    do 
	    {
	        System.out.println(counter45);
	        counter45++;
	    }while(counter45<=10);
		



    }
}