import javax.print.event.PrintEvent;

public class Q16 {

    public void SWAP(int num1 , int num2)
    {
        int temp ;
        temp = num1;
        num1 = num2;
        num2 = temp;
    }

    
    public int[] bubleSort(int[] arrayOfIntegers)
    {
        for (int i =0 ; i < arrayOfIntegers.length-1;i++)
        {
            for (int j=0; j<(arrayOfIntegers.length-i-1);j++)
            {
                if (arrayOfIntegers[j] > arrayOfIntegers[j+1])
                {
                    int tmp = arrayOfIntegers[i];
                    arrayOfIntegers[i] = arrayOfIntegers[i+1];
                    arrayOfIntegers[i+1] = tmp; 
                }
            }
        }

        for (int i =0 ; i < arrayOfIntegers.length;i++)
        {
            System.out.print(arrayOfIntegers[i] + "\t");
        }

        return arrayOfIntegers;
    }

    /*public void printMyArray(int[] array)
    {
        for (int i =0 ; i < array.length-1;i++)
        {
            System.out.print(array[i] + "\t");
        }
    }*/

    public static void main(String[] args) {
        Q16 test = new Q16();
        int[] myArray = {12,53,65,98,88,55,0,12,10,32};
        test.bubleSort(myArray); 
        /*for (int p =0 ; p <myArray.length-1;p++)
        {
            System.out.print(finalArray[p] + "\t");
        }*/

        
        //From github
        /*int temp;
		
		int a[] = {7,6,5,4,3,2,1};
		
		for(int i = 0; i<7; i++)
		{ 
			for(int j=0; j<7-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
							
							
				}
			}
				
		}
		
	 for(int n =0; n<7; n++)
	 {
		 System.out.println(a[n]);
	 }*/

    }
     

    
}
