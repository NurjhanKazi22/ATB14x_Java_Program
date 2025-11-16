package Exercises.Test16112025;

class Employe {
    public double calculateSalary() {
        return 0.0;
    }

}

class Manager extends Employe {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employe {
    private double hourlyRate;
    private int hours;

    public Developer(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hours;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager(60000, 10000);
        Developer developer = new Developer(50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}

