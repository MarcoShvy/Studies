package application;

import entites.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos");
        int n = sc.nextInt();
        PrintService<String> service = new PrintService<>();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            service.addList(value);
        }
        service.print();
        System.out.println("\nFirst: "+ service.first());
    }
}
