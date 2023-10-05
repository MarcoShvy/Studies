package application;

import ex.entites.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary> ");
        Double salary = sc.nextDouble();
        System.out.println("Email of people whose salary is more than 2000:");
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Employee> employees = new ArrayList<>();

            while(line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> emails = employees.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted(comp).collect(Collectors.toList());

            emails.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': ");
            Double sum = employees.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.println(sum);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
