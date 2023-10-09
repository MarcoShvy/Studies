package classes003;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Qual a altura do retangulo");
        retangulo.height = sc.nextDouble();
        System.out.println("Qual a largura do retangulo");
        retangulo.width = sc.nextDouble();

        System.out.println("Area = "+retangulo.area());
        System.out.println("Perimetro = "+retangulo.perimeter());
        System.out.println("Diagonal = "+String.format("%.2f",retangulo.diagonal()));
    }
}
