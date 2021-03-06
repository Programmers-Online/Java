public class MonthCalendar {
   public static void main(String[] args) {
      int currentMonth = 0;

      String season;

      if (currentMonth == 12 || currentMonth == 1 || currentMonth == 2) {
         season = "Winter";
      } else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
         season = "Spring";
      } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
         season = "Summer";
      } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
         season = "Autumn";
      } else {
         season = "Unknown Season";
      }

      System.out.println("The season is " + season);
   }
}
