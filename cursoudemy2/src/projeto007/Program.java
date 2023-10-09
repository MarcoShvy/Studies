package projeto007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Shape> shapes = new ArrayList<>();


        for(int i = 0;i<n;i++){
            System.out.println("Shapoe #"+i+" data: ");
            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("COLOR (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapes.add(new Retangulo(color, height, width));
            }
            else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }

            System.out.println("");
            System.out.println("SHAPES AREAS");
            for (Shape shape: shapes) {
                System.out.println(String.format("%.2f", shape.area()));
            }
        }
    }
}
