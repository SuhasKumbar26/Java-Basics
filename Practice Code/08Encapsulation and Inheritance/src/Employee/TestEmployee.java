package Employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter name: ");
        String name = scan.next();
        employee.setName(name);

        System.out.print("Enter age: ");
        int age = scan.nextInt();
        employee.setAge(age);

        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();
        employee.setSalary(salary);

        /*
        
        System.out.println("Name: "+ employee.getName());
        System.out.println("Age: "+ employee.getAge());
        System.out.println("Salary: "+ employee.getSalary());

        */
        employee.employeeInfo();
    }
}
