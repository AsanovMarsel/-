import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant(new Employee[]{});
        Zarplata(accountant);
    }
    public static void Zarplata (Accountant accountant){
        Scanner scanner = new Scanner(System.in);
        int a = 100;
        while (a != 0){
            System.out.println("""
                1. Добавить нового сотрудника
                2. Рассчитать зарплату для всех сотрудников
                3. Показать информацию о сотрудниках
                4. Калькулятор (для дополнительных расчетов)
                0. Выход""");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    accountant.addEmployee();
                    break;
                case 2:
                    accountant.displayInfo();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Введите матем символы: + , - , / , * ");
                    String symbol = scanner.next();
                    System.out.println("Введите num 1");
                    int numer1 = Integer.parseInt(scanner.next());
                    System.out.println("Введите num 2");
                    int numer2 = scanner.nextInt();
                    switch (symbol){
                        case "+":
                            System.out.println(numer1 + numer2);
                            break;
                        case "-":
                            System.out.println(numer1 - numer2);
                            break;
                        case "*":
                            System.out.println(numer1 * numer2);
                            break;
                        case "/":
                            System.out.println(numer1 / numer2);
                            break;
                    }
                case 0:
                    if (a==0){
                        break;
                    }
            }
        }
    }
}
