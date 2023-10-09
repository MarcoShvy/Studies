package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d04 = Instant.now();
        LocalDate d03 = LocalDate.parse("16/09/2022", fmt1);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d01.format(fmt1));
        System.out.println(d04);
        System.out.println(fmt3.format(d04));
    }
}
