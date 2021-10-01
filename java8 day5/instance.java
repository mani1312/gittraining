zone time instance:

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
 
import java.util.Date;
 
import java.time.Instant;
import java.time.ZoneId;
 
public class Java8Tester {
 
   public static void main(String args[]) {
      Java8Tester java8tester = new Java8Tester();
      java8tester.testBackwardCompatability();
   }

   public void testBackwardCompatability() {
      //Get the current date
      Date currentDate = new Date();
      System.out.println("Current date: " + currentDate);

      //Get the instant of current date in terms of milliseconds
      Instant now = currentDate.toInstant();
      ZoneId currentZone = ZoneId.systemDefault();

      LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
      System.out.println("Local date: " + localDateTime);

      ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
      System.out.println("Zoned date: " + zonedDateTime);
   }
}
Output:
Current date: Fri Oct 01 10:11:44 UTC 2021
Local date: 2021-10-01T10:11:44.559
Zoned date: 2021-10-01T10:11:44.559Z[Etc/UTC]
