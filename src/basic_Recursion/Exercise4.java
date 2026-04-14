
package basic_Recursion;

import java.util.Scanner;

public class Exercise4 {
    public void run(){
        int Number=readOfNumber();
        String result=reverseNumber(Number);
        DoResult(Number,result);
    }

    private int readOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private String reverseNumber(int Number) {
        if (Number<10){
            return String.valueOf(Number);
        }
        return (Number%10)+reverseNumber(Number/10);
    }

    private void DoResult(int number,String result){
        System.out.println("Reversed number of "+number+"="+result);
    }
}
