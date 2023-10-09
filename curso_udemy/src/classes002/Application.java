package classes002;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Preço: ");
        double price = sc.nextDouble();

        //System.out.println("Quantidade: ");
        //int quantidade = sc.nextInt();

        Product product = new Product(name,price);

        System.out.println("Dados do Produto"+product);

        System.out.println("Numero de produtos a serem adicionados");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Novos dados do Produto"+product);

        System.out.println("Numero de produtos a serem retirados");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Novos dados do Produto"+product);
    }
}
