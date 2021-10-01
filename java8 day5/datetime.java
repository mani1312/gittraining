                       DateTime:In java8

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
 
public class Java8Tester {
 
   public static void main(String args[]) {
      Java8Tester java8tester = new Java8Tester();
      java8tester.testLocalDateTime();
   }

   public void testLocalDateTime() {
      // Get the current date and time
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);

      Month month = currentTime.getMonth();
      System.out.println("Month: " + month);

      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);

      //12 december 2014
      LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date2: " + date2);

      //22 hour 15 minutes
      LocalTime date3 = LocalTime.of(22, 15);
      System.out.println("date3: " + date3);

      //parse a string
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("Time: " + date5);
   }
}