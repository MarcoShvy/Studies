package Vetores001;

import Vetores001.entites.Products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for (int i = 0;i< vect.length;i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto");
            String name = sc.nextLine();
            System.out.println("Digite valor do produto");
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
        }
        double sum = 0;
        for (int i = 0;i< vect.length;i++) {
            sum += vect[i].getPrice();
        }
        System.out.println("A média é "+ sum/ vect.length);
    }
}
