
package basic_Recursion;

import java.util.Scanner;

public class Exercise2 {
    
    public void run(){
        int number=readNumber();
        int result=recursiveSumatory(number);
        printResult(number,result);
    }

    
    private int readNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private int recursiveSumatory(int a) {
        if(a==1){
            return 1;
        }
        return a+recursiveSumatory(a-1);
    }

    
    private void printResult(int number,int result){
        System.out.println("Summation up to "+number+"="+result);
    }
}
