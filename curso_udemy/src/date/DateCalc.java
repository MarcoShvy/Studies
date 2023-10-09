package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCalc {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.now();
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDateTime pastWeekTime = d05.minusDays(7);
        LocalDate pastWeek =  d04.minusDays(7);
        LocalDate thisYear = d04.plusYears(1);
        Instant nextWeek = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekTime, d05);
        System.out.println("t1= "+t1.toDays());
        System.out.println("t2 = "+t2.toDays());
        System.out.println(pastWeek);
        System.out.println(thisYear);
        System.out.println(nextWeek);
    }
}
