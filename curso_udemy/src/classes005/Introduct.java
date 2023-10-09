package classes005;

import java.util.Scanner;

public class Introduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotaEstudante aluno = new NotaEstudante();

        System.out.println("Digite nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.println("Digite as 3 notas do aluno em sequencia: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println("O aluno "+aluno.name+" tirou "+aluno.notaTotal()+" pontos");

        if (aluno.aprovado() < 60) {
            System.out.println("Reprovado!");
            System.out.println("Faltaram "+ aluno.aprovado()+" pontos");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
