public class IfExample {
   public static void main(String[] args) {

      // Status of Person
      boolean isAvailable = false;
      boolean isBusy = true;

      if (isAvailable) {
         // do something
         System.out.println("The person is online");
      } else if (isBusy) {
         System.out.println("The person is busy");
      } else {
         System.out.println("The person is offline");
      }
   }
}
