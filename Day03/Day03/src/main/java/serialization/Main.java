package serialization;
import java.io.IOException;
import java.util.*;

import static serialization.EmployeeSerialization.loadEmployees;
import static serialization.EmployeeSerialization.saveEmployees;


public class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Alice", "HR", 50000));
            employees.add(new Employee(2, "Bob", "IT", 60000));

            String fileName = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\emp.txt";

            try {
                saveEmployees(employees, fileName);
                System.out.println("Employees saved successfully.");

                List<Employee> loadedEmployees = loadEmployees(fileName);
                System.out.println("Loaded Employees:");
                for (Employee emp : loadedEmployees) {
                    System.out.println(emp);
                }

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

