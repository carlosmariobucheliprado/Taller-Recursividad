package basic_Recursion;
import java.util.Scanner;

public class Exercise5 {
    
   public void run(){
        int Number=readOfNumber();
        int Result=sumatoryOfDigits(Number);
        Result(Number,Result);
    }

   
    private int readOfNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private int sumatoryOfDigits(int Number){
        if (Number<10){
            return Number;
        }
        return (Number%10)+sumatoryOfDigits(Number/10);
    }
 
    private void Result(int Number,int Result){
        System.out.println("Result of the Sumatory of digits "+Number+"="+Result);
    } 
    
    
}
