package Vetores003;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int qtd = sc.nextInt();
        int[] vect = new int[qtd];

        for (int i = 0;i<qtd;i++) {
            System.out.println("Digite um número");
            vect[i] = sc.nextInt();
        }

        System.out.print("Valores: ");
        for (int i = 0;i<qtd;i++) {
            System.out.print(vect[i]+"  ");
        }

        int sum =0;
        for (int i = 0;i<qtd;i++) {
            sum += vect[i];
        }
        System.out.println("");
        System.out.println("Soma: "+ sum);
        System.out.println("A Média: "+ sum/qtd);
    }
}
