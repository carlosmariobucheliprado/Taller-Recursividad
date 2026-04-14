package advance_Recursion;
import java.util.Scanner;
public class Exercise13 {
    public void run() {
        int ParameterOne = readP1();
        int parameterTwo = readP2();
        int result = ackermannOperation(ParameterOne, parameterTwo);

        printTheResult(ParameterOne, parameterTwo, result);
    }

    private int readP1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parameter One value: ");
        return scanner.nextInt();
    }

    private int readP2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parameter Two value: ");
        return scanner.nextInt();
    }

    private int ackermannOperation(int ParameterOne, int ParameterTwo) {
        if (ParameterOne== 0) {
            return ParameterTwo+1;
        }
        if (ParameterTwo==0){
            return ackermannOperation(ParameterOne-1,1);
        }
        return ackermannOperation(ParameterOne-1, ackermannOperation(ParameterOne, ParameterTwo-1));
    }

    private void printTheResult(int ParameterOne,int ParameterTwo,int result) {
        System.out.println("Ackermann("+ParameterOne+", "+ParameterTwo+")= "+result);
    }
}
