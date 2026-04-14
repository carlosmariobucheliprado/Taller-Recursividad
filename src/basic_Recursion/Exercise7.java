package basic_Recursion;
import java.util.Scanner;
public class Exercise7 {  
    public void run(){
        
        int firstNumber=readTheFirstNumber();
        int secondNumber=readTheSecondNumber();
        int operationResult=greatestCommonDivisor(firstNumber,secondNumber);
        
        printTheResult(firstNumber,secondNumber,operationResult);
        
    }

    private int readTheFirstNumber(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        
        return scanner1.nextInt();
    }

    private int readTheSecondNumber(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        
        return scanner2.nextInt();
    }

    private int greatestCommonDivisor(int firstNumber,int secondNumber){
        if(secondNumber==0){
            
            return firstNumber;
        }
        return greatestCommonDivisor(secondNumber,firstNumber%secondNumber);
    }

    private void printTheResult(int firstNumber,int secondNumber,int operationResult){
        
        System.out.println("Greatest Common Divisor of "+firstNumber+" and "+secondNumber+"="+operationResult);
    }
    
}
