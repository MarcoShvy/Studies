package projeto003;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Client Data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY) : ");
        Date birthday = sdf.parse(sc.next());

        Client cliente = new Client(name, email, birthday);

        System.out.println();
        System.out.println("Enter Order Data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items do this order? ");
        int n = sc.nextInt();
        Order order = new Order(new Date(), status, cliente);

        for (int i = 0;i<n;i++) {
            System.out.printf("Enter #%d item data: ", (i+1));
            System.out.print("Product Name: ");
            String productName = sc.next();
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQtd = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(productQtd, productPrice, product);
            order.addItem(it);
        }

        System.out.println("Order Sumary: ");
        System.out.println(order);

    }
}
