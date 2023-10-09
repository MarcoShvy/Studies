package projeto008;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.printf("Enter number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++) {
            System.out.println("Tax payer #"+(i+1)+" data: ");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual incomming: ");
            Double incoming = sc.nextDouble();
            if(ch =='i') {
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();
                list.add(new Fisica(name, incoming, health));
            } else {
                System.out.print("Number of employeers: ");
                int employees = sc.nextInt();
                list.add(new Juridica(name, incoming, employees));
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID");
        Double totalTax = 0.0;
        for (Pessoa pessoa: list) {
            System.out.println(pessoa.getName()+": $ "+ pessoa.tax());
            totalTax += pessoa.tax();
        }

        System.out.println("TOTAL TAXES: $"+totalTax);
    }
}
