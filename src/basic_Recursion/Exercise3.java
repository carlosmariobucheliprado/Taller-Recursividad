package basic_Recursion;
import java.util.Scanner;
public class Exercise3 {
   public void run(){
        int number=readNumber();
        double result=harmonicSum(number);
        printResult(number,result);
    }
    private int readNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    private double harmonicSum(int a){
        if(a==1) {
            return 1.0;
        }
        return (1.0/a)+harmonicSum(a-1);
    }
    private void printResult(int number,double result) {
        System.out.println("Harmonic summation up to "+number+"=" +result);
    } 
}
