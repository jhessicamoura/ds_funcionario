package com.devsuperior;

import com.devsuperior.entities.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Emplyoee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i=0; i < n; i++){
            if (id == employees.get(i).getId()){
                System.out.println();
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                employees.get(i).increaseSalary(percentage);
                found = true;
                break;

            }

        }

        if (!found){
            System.out.println("This id does not exist!");
            System.out.println();
        }

        System.out.println("List of employees:");

        for (Employee employee : employees){
            System.out.println(employee);
        }

        sc.close();
    }
}