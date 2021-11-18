import java.util.Scanner;
import java.util.ArrayList;
public class Q18 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNames = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        
        //user enters the length
        System.out.println("Enter the size of the array!");
        int sizeOfMyArray = input.nextInt();
        int number = 0;
        int counter =0;
        
        //user enter the elements
        while (number != -1)
        {
            System.out.print("Enter element or -1 to exist:");
            System.out.println();
            number = input.nextInt();
            arrayOfNames.add(number);    
        }
        
        //take them in an array
        int[] moArray = new int[sizeOfMyArray];
        for(int i =0; i<sizeOfMyArray-1;i++)
        {
            moArray[i] = arrayOfNames.get(i);
        }


        int temp;
        for(int i = 0; i<sizeOfMyArray; i++)
		{ 
			for(int j=0; j<sizeOfMyArray-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;					
				}
			}
        }
        
        System.out.println("Enter the element to show you the index of this element:");
        int usersElement = input.nextInt();


        int first =0;
        last = sizeOfMyArray-1;
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < usersElement ){  
             first = mid + 1;     
           }else if ( arr[mid] == usersElement ){  
             System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println(-1);  
        }  



    }
    
}
