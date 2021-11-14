public class Q13 
{
    
   public static void main(String[] args) 
   {
    //a
    for (int i =1; i <5; i++)
    {
        for (int j = 0 ; j < i ;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    //b
    for (int b = 1; b < 6; b++)
    {
        if (b == 1 || b == 5)
        {
            System.out.println("  *  ");
        }
        if (b == 2 || b == 4)
        {
            System.out.println(" *** ");
        }
        if (b == 3 )
        {
            System.out.println("*****");
        }
    }

    //c
    for (int M = 1; M < 5;M++)
    {
        if (M==1)
        {
            System.out.println("1010101");
        }
        if (M==2)
        {
            System.out.println(" 10101 ");
        }
        if (M==3)
        {
            System.out.println("  101  ");
        }
        if (M==4)
        {
            System.out.println("   1   ");
        }
    }
    
    
   }
}
