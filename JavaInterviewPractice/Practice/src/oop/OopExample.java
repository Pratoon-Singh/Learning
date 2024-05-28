package oop;

import oop.inheritance.Developer;
import oop.inheritance.Employee;
import oop.inheritance.Manager;

public class OopExample {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice", 101, 95000, 5);
        Developer developer = new Developer("Bob", 102, 85000, "Java");



        System.out.println("Manager Details:");
        manager.displayDetails();
        manager.work();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        developer.work();


        Employee[] employees = new Employee[2];

        // Storing Manager and Developer objects in the array
        employees[0] = new Manager("James", 201, 95000, 5);
        employees[1] = new Developer("Oliver", 202, 85000, "Java");

        // Loop through the array and call the work method
        for (Employee emp : employees) {
            emp.displayDetails();
            emp.work();
            System.out.println();
        }
    }

}
