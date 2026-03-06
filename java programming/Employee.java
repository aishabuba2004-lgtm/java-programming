class Employee {
    void calculateSalary() {
        System.out.println("Salary calculation");
    }
}
class FullTimeEmployee extends Employee{
    void calculateSalary() {
        System.out.println("Full-time employee salary: 8000");
    }
}
class PartTimeEmployee extends Employee{
    void calculateSalary() {
        System.out.println("Part-time employee salary: 5000");
    }
}
class TestEmployee {
    public static void main(String[]args) {
  FullTimeEmployee f = new
        FullTimeEmployee();
  PartTimeEmployee p = new
        PartTimeEmployee();
        f.calculateSalary();
        p.calculateSalary();
    }
}