package Vetores005;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int qtd = sc.nextInt();
        int[] numeros = new int[qtd];
        int pares = 0;

        for (int i = 0;i<qtd;i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros Pares: ");
        for (int i = 0;i<qtd;i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i]+"  ");
                pares++;
            }
        }
        System.out.printf("Quantidades de Pares: %d", pares);
    }
}