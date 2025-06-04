// Fig. 8.26: RecordPatternMatchingDemo.java
// Assigning result of a switch expression to a variable.

public class RecordPatternMatchingDemo {
   // record classes representing data for a Rectangle and a Circle
   record Rectangle(double length, double width) { }
   record Circle(double radius) { }

   public static void main(String[] args) {
      Rectangle r = new Rectangle(10, 5);
      Circle c = new Circle(10);
      System.out.printf("Rectangle r: %s%nperimeter: %.2f%n%n", 
         r, getPerimeter(r));
      System.out.printf("Circle c : %s%nperimeter: %.2f%n", 
         c, getPerimeter(c));
   }
         
   // uses pattern-matching switch to calculate perimeter of a 
   // Rectangle or Circle; throws IllegalArgumentException for other types
   public static double getPerimeter(Object shape) {
      return switch (shape) {
         case Rectangle r -> 2 * r.length() + 2 * r.width();
         case Circle c -> 2 * Math.PI * c.radius();
         default -> throw new IllegalArgumentException("invalid type"); 
      };
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
