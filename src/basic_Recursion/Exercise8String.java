package basic_Recursion;
import java.util.Scanner;
public class Exercise8String {
    
    public void run(){
        String text=readOfTheText();
        String copy=copyTheString(text,0);
        printTheResult(text,copy);
    }
    
    private String readOfTheText(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text:");
        return scanner.nextLine();
    }

    private String copyTheString(String text,int index){
        if (index==text.length()){
            return "  ";
        }
        return text.charAt(index)+copyTheString(text,index+1);
    }

    private void printTheResult(String original, String copy) {
        System.out.println("Original:"+original);
        System.out.println("Copy:"+copy);
    }
}
