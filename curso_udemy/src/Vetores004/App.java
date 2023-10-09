package Vetores004;
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas? ");
        int qtd = sc.nextInt();

        String[] vectName = new String[qtd];
        int[] vectIdade = new int[qtd];
        double[] vectAltura = new double[qtd];

        for (int i = 0;i<qtd;i++) {
            sc.nextLine();
            System.out.printf("Dados da %da Pessoa \n", i+1);
            System.out.println("Nome: ");
            vectName[i] = sc.nextLine();
            System.out.println("Idade: ");
            vectIdade[i] = sc.nextInt();
            System.out.println("Altura: ");
            vectAltura[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0;i<qtd;i++) {
            sum += vectAltura[i];
        }

        int idadeMenor = 0;
        for (int i = 0;i<qtd;i++) {
            if (vectIdade[i] < 16) {
                idadeMenor++;
            }
        }

        double avgIdade = ((double)idadeMenor / qtd) * 100;

        System.out.println("Altura média: "+ sum / qtd);
        System.out.println("Pesosas com menos de 16 anos"+ avgIdade+"%");
        for (int i = 0;i<qtd;i++) {
            if (vectIdade[i] < 16) {
                System.out.println(vectName[i]);
            }
        }
    }
}
