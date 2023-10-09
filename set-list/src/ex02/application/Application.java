package ex02.application;

import ex02.entites.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Set<Student> students = new HashSet<>();
        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();
        for (int i = 0; i < courseB; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();
        for (int i = 0; i < courseC; i++) {
            students.add(new Student(sc.nextInt()));
        }

        System.out.println("Total students: "+ students.size());
    }
}
