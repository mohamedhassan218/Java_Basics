import java.util.Arrays;
public class Q15 {
    
 
    //Main functoin
    public static void main(String[] args) {
        int[] myArray = {12,53,53,65,8,777,9,0,66,58};
        // System.out.println(Q15.bubleSort(myArray));
        int[] newArray ;
        newArray =  bubleSort(myArray[});
        System.out.print("The array after sorting: ");
        System.out.println(Arrays.toString(newArray));
    }

    public static viod swaap(int a , int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
    }
    
    public static int[]  bubleSort (int[] arrayOfIntegers)
    {
        for (int i = 0; i < arrayOfIntegers.length-1;i++)
        {
            for (int j =0; j <arrayOfIntegers.length-1;j++)
            {
                if (arrayOfIntegers[i] > arrayOfIntegers[i+1])
                {
                    swaap(arrayOfIntegers[i] , arrayOfIntegers[i+1]);
                }
            }
        }
        return arrayOfIntegers;
    }
}
