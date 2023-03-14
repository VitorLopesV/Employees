package main;

    import entities.Employee;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Locale;
    import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee register = new Employee();

        System.out.print(" How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employeelist = new ArrayList<>();

        for (int i = 1; i <= n; i++) { // INSERINDO OS DADOS DOS FUNCIONÁRIOS NO EMPLOYEELIST

            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            register.setId(sc.nextInt());
            System.out.print("Name: ");
            sc.nextLine();
            register.setName(sc.nextLine());
            System.out.print("Salary: ");
            register.setSalary(sc.nextDouble());
            System.out.println();

            Employee employee = new Employee(register.getId(), register.getName(), register.getSalary());

            employeelist.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int salaryIncrease = sc.nextInt();
        System.out.print("Enter the porcentage: ");
        double porcentage = sc.nextDouble();
        System.out.println();

        for (Employee employee : employeelist) { // FILTRANDO ID DO FUNCIONÁRIO QUE IRÁ GANHAR AUMENTO DE SALÁRIO

            if (employee.getId() == salaryIncrease) {
                employee.setSalary(register.salaryIncrease(porcentage));
               }
            }
        System.out.println("List of employees:"); //IMPRIMINDO OS DADOS DOS FUNCIONÁRIOS
        System.out.println();
        for (Employee x : employeelist) {
            System.out.println(x);
        }
    }
}



