package aula001;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Order order = new Order(131, new Date(), OrderStatus.PROCESSANDO_PAGAMENTO);
        System.out.println(order);
        OrderStatus os1 = OrderStatus.ENVIANDO;
        OrderStatus os2 = OrderStatus.valueOf("ENVIANDO");
        System.out.println(os1);
        System.out.println(os2);
    }
}
