package basic_Recursion;
import java.util.Scanner;
public class Exercise9 {
    
     public void run(){
        int firstNumber=toReadTheFirstNumber();
        int secondNumber=toReadTheSecondNumber();
        int result=multiply(firstNumber, secondNumber);
        toPrintResult(firstNumber,secondNumber,result);
    }

    private int toReadTheFirstNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number:");
        return scan.nextInt();
    }

    private int toReadTheSecondNumber() {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter the second number:");
        return scann.nextInt();
    }

    private int multiply(int number,int times){
        if (times==0){
            return 0;
        }
        if (times<0){
            return -multiply(number,-times);
        }
        return number+multiply(number, times-1);
    }

    private void toPrintResult(int firstNumber, int secondNumber, int result) {
        System.out.println("Multiplication "+firstNumber+" * "+secondNumber+"= "+result);
    }
   
}

