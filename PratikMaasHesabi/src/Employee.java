public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        double tax = 0;
        double bonus = 0;
        double raiseSalary = 0;

    }

    public void tax() {

        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }

    }

    public void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    public void raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            this.raiseSalary = (this.salary * 0.05);
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            this.raiseSalary = (this.salary * 0.1);
        } else {
            this.raiseSalary = (this.salary * 0.15);
        }

    }

    public double total() {
        return this.salary += this.bonus + this.raiseSalary - this.tax;
    }

    public void printInfo() {
        System.out.println("Adı \t: " + this.name);
        System.out.println("Maaşı \t: " + this.salary);
        System.out.println("Çalışma saati\t: " + this.workHours);
        System.out.println("Başlangıç yılı \t:  " + this.hireYear);
        System.out.println("Vergi\t: " + this.tax);
        System.out.println("Bonus\t:" + this.bonus);
        System.out.println("Maaş artışı\t:" + this.raiseSalary);
        System.out.println("Vergiler ve bonuslar ile maaş \t: " + (this.salary - this.tax + this.bonus));
        System.out.println("Toplam maaş\t: " + total());
    }

}
