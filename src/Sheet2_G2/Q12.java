public class Q12 {
    public static int POW(int number ,int powerOfNumber)
    {
        int OUTPUT = 1;
        for (int i =1; i <= powerOfNumber ;i++)
        {
            OUTPUT *= number;
        }
        return OUTPUT;
    }
    public static void main(String[]args) 
    {
        System.out.println(Q12.POW(3,3));
    }
    
}
