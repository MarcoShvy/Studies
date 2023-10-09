package ex01.application;

import ex01.entites.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter path");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<User> logs = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String fields[] = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                logs.add(new User(username, moment));

                line = br.readLine();
            }
            System.out.println("Total Users" + logs.size());
        } catch (Exception e ) {
            System.out.println(e);
        }
    }
}
