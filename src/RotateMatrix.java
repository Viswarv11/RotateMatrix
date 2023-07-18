import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size of the 2D Array:");
        int rowsize=scanner.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int colsize=scanner.nextInt();
        int array[][]=new int[rowsize][colsize];
        System.out.println("Enter the Array Elements row wise:");
        for (int i = 0; i < rowsize; i++) {
            for(int j=0;j<colsize;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        rotate(array,rowsize,colsize);
    }
    public static void rotate(int[][] array,int row,int col){
        int temp=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i<j)
                {
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                temp=array[i][j];
                array[i][j]=array[i][array.length-1-j];
                array[i][array.length-1-j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
