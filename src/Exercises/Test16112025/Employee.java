package Exercises.Test16112025;

public class Employee {
    private int  id ;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("John Doe");
        e.setSalary(5000);
        System.out.println("Employee ID:"+ e.getId()+" " + "Employee Name:"+ " "+e.name+" "+"Employee Salary:"+ e.salary);
    }



}
