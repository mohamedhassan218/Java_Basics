import java.util.Scanner;
import java.util.Random;
public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //Promit
        System.out.println("Please enter the dimentional of the first array !");
        System.out.print("rows: ");
        int r1 = input.nextInt();
        System.out.println();
        System.out.print("colums: ");
        int c1 = input.nextInt();
        System.out.println();
        System.out.println("Please enter the dimentional of the seconed array !");
        System.out.print("rows: ");
        int r2 = input.nextInt();
        System.out.println();
        System.out.print("colums: ");
        int c2 = input.nextInt();
        System.out.println();

        //create the two matrices
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];

        if (c1 == r2)
        {

            //Filling them with random numbers
            int[][] finalMatrix = new int[r1][c2];
            for (int i1 = 0; i1 < r1;i1++)
            {
                for (int j1 =0;j1<c1;j1++)
                {
                    matrix1[i1][j1] = rand.nextInt(101);   
                }
            }
            for (int i2 = 0; i2 < r2;i2++)
            {
                for (int j2 =0;j2<c2;j2++)
                {
                    matrix2[i1][j1] = rand.nextInt(101);   
                }
            }

            for (int i =0 ;i<r1;i++)
            {
                for (int j =0;j<c2;j++)
                {
                    int sum =0 ;
                    for (int c =0;c<c2;c++)
                    {
                        sum += matrix1[i][c] * matrix2[c][j];
                    }
                    finalMatrix[i][j] = sum;
                }
            }


        }

    }
    
}
