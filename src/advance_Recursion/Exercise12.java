package advance_Recursion;
import java.util.Scanner;
public class Exercise12 {
    
    public void run(){
        int limit=readTheLimit();
        printSeries(limit);
    }

    private int readTheLimit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit of Fibonacci serie:");
        return scanner.nextInt();
    }

    private int fibonacciOperation(int f){
        if (f == 0){
            return 0;
        }
        
        if (f == 1){
            return 1;
        }
        return fibonacciOperation(f-1)+fibonacciOperation(f-2);
    }

    private void printSeries(int limit){
        System.out.print("Fibonacci series:");

        for (int a =0; a<=limit; a++) {
            System.out.print(fibonacciOperation(a) +" | ");
        }
        System.out.println();
        System.out.println();
    }
}
