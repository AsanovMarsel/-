import java.util.Arrays;
import java.util.Scanner;

public class Accountant {
    private Employee[] people;

    public Accountant(Employee[] people) {
        this.people = people;
    }

    public void displayInfo(){
        for (Employee employee: this.people){
            System.out.println("name :" +employee.getName() + " :");
            System.out.println("base salary :" +employee.getBaseSalary());
            System.out.println("hourly rate :" + employee.getHourlyRate());
            System.out.println("worked hours :" + employee.getWorkedHours());
        }
    }

    public void addEmployee(){
        Scanner scanner = new Scanner(System.in);
             System.out.println("Введите имя сотрудника");
             String name = scanner.next();
             System.out.println("Введите базовую зарплату");
        int salary = scanner.nextInt();
        System.out.println("Введите количество отработанных часов");
        int workedHours = scanner.nextInt();
        System.out.println("Введите ставку за час: 500");
        int hourlyRate = scanner.nextInt();
        Employee employee = new Employee(name, salary, workedHours, hourlyRate);
        Employee[] newEmployee = Arrays.copyOf(people, people.length + 1);
        newEmployee[newEmployee.length - 1] = employee;
        people = newEmployee;
        System.out.println("Сотрудник добавлен!");
    }
    }

