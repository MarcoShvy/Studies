package projeto006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or import (c/u/i)? ");
            char res = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (res == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add( new ImportedProduct(name, price, fee));
            } else if (res == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                Date dataFormatada = formato.parse(date);
                list.add(new UsedProduct(name, price, dataFormatada));
            } else {
                list.add(new Product(name, price));
            }

        }

        System.out.println("\nPrice Tags");
        for (Product product: list) {
            System.out.println(product.priceTag());
        }
    }
}


