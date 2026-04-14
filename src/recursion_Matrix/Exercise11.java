package recursion_Matrix;
import java.util.Random;
import java.util.Scanner;
public class Exercise11 {
    
    public void run(){
        int rows=toReadRows();
        int cols=toReadCols();
        int[][] matrix=toCreateMatrix(rows,cols);
        toGenerateData(matrix);
        int result=sumOfMatrix(matrix,0,0);
        toPrintMatrix(matrix);
        toPrintResult(result);
    }

    private int toReadRows(){
        Scanner sca=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        
        return sca.nextInt();
    }

    private int toReadCols(){
        Scanner scann= new Scanner(System.in);
        System.out.print("Enter number of columns:");
        return scann.nextInt();   
        
    }

    private int[][] toCreateMatrix(int rows,int cols){
        return new int[rows][cols];
    }

    private void toGenerateData(int[][] matrix) {
        Random random =new Random();

        for (int i = 0; i<matrix. length; i++){
            
            for (int j = 0; j<matrix[i].length; j++) {
                matrix[i][j]=random.nextInt(10)+1;
            }
        }
    }

    private int sumOfMatrix(int[][] matrix,int row,int col){
        if(row==matrix.length){
            
            return 0;
        }

        if(col == matrix[row].length){
            return sumOfMatrix(matrix,row+1,0);
        }
        return matrix[row][col]+sumOfMatrix(matrix,row,col+1);
    }

    private void toPrintMatrix(int[][] matrix){
        System.out.println();
        System.out.println();
        System.out.println("Matrix:");
        for (int[] row : matrix){
            for (int value : row){
                System.out.print(value + " | ");
            }
            System.out.println();
            System.out.println();
        }
    }

    private void toPrintResult(int result){
        System.out.println("Result to the Sum of matrix elements="+result);
    }
}
