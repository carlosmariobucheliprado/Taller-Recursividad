package recursion_Array;
import java.util.Random;
import java.util.Scanner;
public class Exercise10 {
   
    public void run() {
        int size=toReadSize();
        int[] numbers=toCreateArray(size);
        toGenerateData(numbers);
        int result=sumArray(numbers, 0);
        toPrintArray(numbers);
        toPrintResult(result);
    }

    private int toReadSize(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter array size:");
        return scan.nextInt();
    }

    private int[] toCreateArray(int size){
        return new int[size];
    }

    private void toGenerateData(int[] array){
        Random random = new Random();
        for (int i = 0; i<array.length; i++){
            array[i]=random.nextInt(10)+1; 
        }
    }

    private int sumArray(int[] array,int index) {       
        if (index >=array.length){
            return 0;
        }

        return array[index]+sumArray(array, index+1);
    }

    private void toPrintArray(int[] array){
        System.out.print("Array: ");
        System.out.print("[");
        for (int value : array) {
            System.out.print(value + " | ");
        }
        
        System.out.println("]\n");
    }
    
    private void toPrintResult(int result) {
        System.out.println("Sum of array elements ="+result);
    }
   
}