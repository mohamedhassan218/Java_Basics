public class Q10 
{
    public static void SWAP(int num1 , int num2)
    {
        int temp ;
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
     public static void main(String[] args) 
    {
        int n1 = 2, n2 = 3;
        Q10.SWAP(n1,n2);
        System.out.println(n1);
        System.out.println(n2);
        
    }
    
    
}
