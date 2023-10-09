package Vetores002;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar: ");
        int qtd = sc.nextInt();
        int[] vect = new int[qtd];
        for (int i = 0;i<qtd;i++) {
            System.out.println("Digite um número");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos:");
        for (int i = 0;i<qtd;i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
