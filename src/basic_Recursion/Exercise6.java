package basic_Recursion;
import java.util.Scanner;
public class Exercise6 {
    
  public void run(){
      
        int base=readTheBase();
        int exponent=readTheExponent();
        long result=DoOperetion(base,exponent);
        
        printTheResult(base,exponent,result);
    }

  
    private int readTheBase(){
        Scanner scanner1= new Scanner(System.in);
        System.out.print("Enter the base number: ");
        return scanner1.nextInt();
    }

    
    private int readTheExponent(){
        
        Scanner scanner2= new Scanner(System.in);
        System.out.print("Enter the exponent of the number: ");
        return scanner2.nextInt();
    }

    
    private long DoOperetion(int base, int exponent){
        
        if (exponent==0){
            return 1;
        }
        return base*DoOperetion(base,exponent-1);
    }

    
    private void printTheResult(int base,int exponent,long result){
        System.out.println(base+"^"+exponent+" ="+result);
    }
    
}  

