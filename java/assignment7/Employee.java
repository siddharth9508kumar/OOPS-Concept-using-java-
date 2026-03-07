class Employee {
    String name;
    double salary;
    int hireDate;

    public Employee(String name, double salary, int hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int calYears(int currentY) {
        return currentY - hireDate;
    }

    void print() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
        System.out.println("Years of working: " + calYears(2025));
    }

    public static void main(String[] args) {
        Employee E = new Employee("Subham", 90000, 1998);
        E.print();
    }
}


//output
//Employee name: Subham
//Employee salary: 90000.0
//Years of working: 27

