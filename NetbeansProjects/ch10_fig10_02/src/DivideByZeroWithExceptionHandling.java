// Fig. 10.2: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator)
      throws ArithmeticException {
      return numerator / denominator; // possible division by zero
   } 

   public static void main(String[] args) {
      var input = new Scanner(System.in); 
      boolean continueLoop = true; // determines if more input is needed

      while (continueLoop) {
         try { // read two numbers and calculate quotient                 
            System.out.print("Enter an integer numerator: ");    
            int numerator = input.nextInt();                            
            System.out.print("Enter an integer denominator: ");  
            int denominator = input.nextInt();                          
      
            int result = quotient(numerator, denominator);              
            System.out.printf("%nResult: %d / %d = %d%n", numerator,     
               denominator, result);                                     
            continueLoop = false; // input successful; end looping        
         }
         catch (InputMismatchException inputMismatchException) {        
            System.err.printf("%nException: %s%n",                       
               inputMismatchException);                                  
            input.nextLine(); // discard input so user can try again
            System.out.printf(                                          
               "You must enter integers. Try again.%n%n");          
         }                                                              
         catch (ArithmeticException arithmeticException) {              
            System.err.printf("%nException: %s%n", arithmeticException);
            System.out.printf(                                          
               "Zero is an invalid denominator. Try again.%n%n");   
         }
      }
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2025 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
