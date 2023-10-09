package listDesafio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many employees will be registred: ");
        int n = sc.nextInt();

        List<Employee> list= new ArrayList<>();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d\n", (i+1));
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id do not exist!");
        } else {
            System.out.println("Enter the percentage");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees");
        for (Employee obj: list) {
            System.out.println(obj);
        }
    }
}
