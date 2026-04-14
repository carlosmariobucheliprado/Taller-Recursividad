package basic_Recursion;
import java.util.Scanner;
public class Exercise1 {
    
    public void run(){
        int number=readNumber();
        long result=factorial(number);
        printResult(number,result);
    }
  
    private int readNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private long factorial(int a){
        if(a==0||a ==1){
            return 1;
        }
        return a*factorial(a-1);
    }

    private void printResult(int number,long result) {
        System.out.println("Factorial of "+number+"="+result);
    }
}
