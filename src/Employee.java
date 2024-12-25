public class Employee {
    private String name;
    private int baseSalary;
    private int workedHours;
    private int hourlyRate;

    public Employee(String name, int baseSalary, int workedHours, int hourlyRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    public void calculateSalary() {
        System.out.println(workedHours * (hourlyRate + baseSalary));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
