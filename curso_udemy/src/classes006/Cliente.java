package classes006;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Enter Account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder");
        sc.nextLine();
        String holder = sc.nextLine();


        System.out.println("Deseja inserir um valor inicial (y/n)");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("y")) {
            System.out.println("Entre valor do deposito inicial");
            double depositoinicial = sc.nextDouble();
            account = new Account(number, holder, depositoinicial);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account Data");
        System.out.println(account);
        
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        account.addMoney(deposito);
        System.out.println("Update accont data");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        account.removeMoney(saque);
        System.out.println("Update Account");
        System.out.println(account);
    }
}
