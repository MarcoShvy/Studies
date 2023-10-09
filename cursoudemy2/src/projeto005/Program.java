package projeto005;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.printf("Enter the number of Employees: ");
        int n = sc.nextInt();

        for (int i = 0;i<n;i++) {
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.printf("Outsorced (y/n)? ");
            String res = sc.next();
            sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Hours: ");
            Integer hours = sc.nextInt();
            System.out.printf("Value per hour: ");
            Double valuePerHours = sc.nextDouble();
            if (res.equalsIgnoreCase("y")) {
                System.out.printf("Additional charge: ");
                Double addCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, addCharge);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }
        }

        System.out.println("");
        System.out.println("PAYMENTS");
        for (Employee emp: list) {
            System.out.println(emp.getName()+ " - $"+emp.payment());
        }
    }
}
