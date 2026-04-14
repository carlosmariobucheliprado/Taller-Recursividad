
package basic_Recursion;


public class ViewBasicRecursion {

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        System.out.println("Exercise 1: ");
        System.out.println("To calculate a factorial number");
        ex1.run();
        
        //line space.
        System.out.println();

        Exercise2 ex2 = new Exercise2();
        System.out.println("Exercise 2: ");
        System.out.println("To calculate the summation up to the entered number");
        ex2.run();
        
        System.out.println();
        
        Exercise3 ex3 = new Exercise3();
        System.out.println("Exercise 3:");
        System.out.println("To calculate the summation up to the entered number in the expression (1/n)");
        ex3.run();

        System.out.println();
        
        
        Exercise4 ex4 = new Exercise4();
        System.out.println("Exercise 4:");
        System.out.println("To reverse a number");
        ex4.run();

        System.out.println();
        
        Exercise5 ex5 = new Exercise5();
        System.out.println("Exercise 5:");
        System.out.println("To calculate the sum of the digits in a number");
        ex5.run();

        System.out.println();
        
        Exercise6 ex6 = new Exercise6();
        System.out.println("Exercise 6:");
        System.out.println("To calculate the power of a base raised to an exponent");
        ex6.run();

        System.out.println();
        
        Exercise7 ex7 = new Exercise7();
        System.out.println("Exercise 7:");
        System.out.println("To calculate the greatest common divisor using Euclid's algorithm");
        ex7.run();

        System.out.println();
        
        Exercise8 ex8 = new Exercise8();
        System.out.println("Exercise 8:");
        System.out.println("To calculate the greatest common divisor using Euclid's algorithm");
        ex8.run();

        System.out.println();
        
        System.out.println();

        Exercise8String ex8String = new Exercise8String();
        System.out.println("Exercise String 8:");
        System.out.println("To copy a string recursively");
        ex8String.run();
        
        Exercise9 ex9 = new Exercise9();
        System.out.println("Exercise 9:");
        System.out.println("To calculate multiplication using successive sums");
        ex9.run();
    }
}
