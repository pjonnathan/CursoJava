package application;

import entities.Course;
import entities.Employee;
import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        


        Scanner scanner =  new Scanner(System.in);

        Set<Integer> ida = new HashSet<>();
        Set<Integer> idb = new HashSet<>();
        Set<Integer> idc = new HashSet<>();

        Course A = new Course("A");
        Course B = new Course("B");
        Course C = new Course("C");

        Employee employee = new Employee("Alex");
        employee.setCoursesList(A);

        System.out.println("How many student for course A");
        int a = scanner.nextInt();

        for(int i=0; i<a; i++){
            int id = scanner.nextInt();
            String name = scanner.next();
            Student student = new Student(id, name);
            A.addStudent(student);
            ida.add(id);
        }

        System.out.println("How many student for course B");
        int b = scanner.nextInt();

        for(int i=0; i<b; i++){
            int id = scanner.nextInt();
            String name = scanner.next();
            Student student = new Student(id, name);
            B.addStudent(student);
            idb.add(id);
        }

        System.out.println("How many student for course C");
        int c = scanner.nextInt();

        for(int i=0; i<c; i++){
            int id = scanner.nextInt();
            String name = scanner.next();
            Student student = new Student(id, name);
            C.addStudent(student);
            idc.add(id);
        }

        Set<Integer> total = new HashSet<>(ida);
        total.addAll(idb);
        total.addAll(idc);

        System.out.println("Total de Students : " + total.size());

    }
}
