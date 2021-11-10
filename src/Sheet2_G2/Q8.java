public class Q8 
{
     public static void main(String[] args) 
    {
        int arrayOfNumbers[] = new int [10];
        arrayOfNumbers[0] = 0;
        arrayOfNumbers[1] = 1;
        for (int i = 2 ; i <10;i++)
        {
            arrayOfNumbers[i] = arrayOfNumbers[i-2] + arrayOfNumbers[i-1]; 
        }
        for (int pr =0 ; pr < 10; pr++)
        {
            System.out.println(arrayOfNumbers[pr]);
        }
    }
    
}
