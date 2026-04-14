package basic_Recursion;

import java.util.Scanner;

public class Exercise8 {
    public void run(){
        int dividend=readTheDividend();
        int divisor=readTheDivisor();
        int result=operationDivision(dividend,divisor);
        printTheResult(dividend,divisor,result);
    }

    
    private int readTheDividend(){
        Scanner scanner1= new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        return scanner1.nextInt();
    }

    private int readTheDivisor(){
        Scanner scanner2= new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        return scanner2.nextInt();
    }

    private int operationDivision(int dividend,int divisor){
        if (dividend<divisor){
            return 0;
        }
        return 1+operationDivision(dividend-divisor,divisor);
    }

    
    private void printTheResult(int dividend,int divisor,int result){
        System.out.println("Integer division "+dividend +"/"+divisor+"="+result);
    }
    
}
