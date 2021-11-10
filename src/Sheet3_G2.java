public class Sheet3_G2 {
    public static void main (String[] args)
    {
      for (int i = 1; i <6;i++)
      {
          int stars = i;
          int counter =0;
          if (i ==1 || i == 5)
          {
              
              
              while (counter != (i-1)/2)
              {
                  System.out.print(" ");
                  counter ++;
              } 
              System.out.print("*");
              counter =0;
              while (counter != (i-1)/2)
              {
                  System.out.print(" ");
              } 

          }
          else 
          {




          }
      }

    }
    
}
