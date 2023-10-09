package classes004;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();

        System.out.println("Qual seu nome");
        empregado.name = sc.nextLine();
        System.out.println("Salario bruto");
        empregado.grossSalary = sc.nextDouble();
        System.out.println("Impostos");
        empregado.tax = sc.nextDouble();

        System.out.println("Employee: "+empregado.name+", $ "+empregado.netSalary()+"\n");

        System.out.println("Qual percentuagem deseja acrescentar: ");
        double percentage = sc.nextDouble();
        empregado.increaseSalary(percentage);

        System.out.println("Uptade data: "+empregado.name+", $ "+empregado.netSalary());
    }
}
