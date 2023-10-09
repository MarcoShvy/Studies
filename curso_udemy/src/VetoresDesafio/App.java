package VetoresDesafio;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rents[] vect = new Rents[10];
        System.out.println("quantos quartos vao ser alugados");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rents(name, email);
        }
        System.out.println("Quartos cheios");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i+": "+vect[i]);
            }
        }
    sc.close();
    }
}
