public class NestedIfElse {
   public static void main(String[] args) {
      int number = 5;

      if (number == 16) {
         System.out.println("The number is 16");
         if (number < 17) {
            System.out.println("The number is less than 17");
         }
      } else if (number == 15) {
         System.out.println("The number is 15");
         if (number < 10) {
            System.out.println("The number is less than 10");
         } else if (number < 15) {
            System.out.println("The number is less than 15");
         } else {
            System.out.println("Unknown number");
         }
      } else {
         System.out.println("You couldn't guessed correctly.");
      }
   }
}
