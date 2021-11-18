public class Q20 {

    public static int[] q20Function (int[] array , int number)
    {
        
        int[] finalArray = new int[array.length+1];
        for (int i =0 ; i < array.length-1;i++)
        {
            finalArray[i] = array[i];
        }
        finalArray[array.length] = number; //Adding the element to the new array
        
        for(int i = 0; i<finalArray.length-1; i++)
		{ 
			for(int j=0; j<length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
							
							
				}
			}
				
		}
        return finalArray;
    } 
    
    public static int[] function(int[] usersArray, int num) 
    {
        int[] myArray = new int[usersArray.length+1];

        for (int s =0; s < usersArray.length-1; s++)
        {
            myArray[s] = usersArray[s];
        }

        for (int i = 0 ; i <myArray.length-1;i++)
        {
            if (myArray[i] >= num)
            {
                for (int j = i; j<myArray.length-1;j++)
                {
                    myArray[j+1] = myArray[j];
                }
                myArray[i] = num;
            }
        }

        for (int p =0 ; p < myArray.length - 1;p++)
        {
            System.out.print(myArray[p] + "\t");
        }

        return myArray;

    }


    public static void main(String[] args) {
        
        int arr = {10,20,30,50,60};
        function(arr, 40);
        
    }
    
}
