package application;

import model.entites.Reservation;
import model.exceptions.DomainExceptions;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room Number: ");
            int number = sc.nextInt();
            System.out.print("CheckIn data: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("CheckOut data: ");
            Date checkOut = sdf.parse(sc.next());
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data uptade: ");
            System.out.print("CheckIn data: ");
            checkIn = sdf.parse(sc.next());
            System.out.print("CheckOut data: ");
            checkOut = sdf.parse(sc.next());

            reservation.update(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }

        catch (ParseException e) {
            System.out.println("Invalid date error");
        }
        catch (DomainExceptions e ) {
            System.out.println("Error in reservation"+ e.getMessage());
        }
        catch (RuntimeException e ) {
            System.out.println("Unexpect Error!");
        }
    }
}

