package company;

import java.time.LocalDate;

public class Application {
  public static void main(String[] args) {
    Manager ceo = new Manager("001", "CEO", "A", LocalDate.of(1982, 12, 1), null);

    Manager m1 = new Manager("002", "Rock", "B", LocalDate.of(1988, 7, 16), ceo);
    Manager m2 = new Manager("003", "Miller", "C", LocalDate.of(1989, 2, 15), m1);
    Manager m3 = new Manager("004", "Marry", "D", LocalDate.of(1987, 1, 3), ceo);

    Employee e1 = new Employee("005", "Tom", "E", LocalDate.of(1984, 10, 28), m1);
    Employee e2 = new Employee("006", "Peter", "F", LocalDate.of(1994, 8, 8), m1);
    Employee e3 = new Employee("007", "Joe", "G", LocalDate.of(1991, 6, 21), m2);
    Employee e4 = new Employee("008", "Charles", "H", LocalDate.of(1996, 4, 22), m2);
    Employee e5 = new Employee("009", "DJ", "I", LocalDate.of(1989, 3, 12), m2);
    Employee e6 = new Employee("010", "Gratify", "J", LocalDate.of(1995, 5, 18), m3);

    System.out.println("Problem1 - get Managers from Employee");
    System.out.println(e5.getManagers() + "\n");
    System.out.println("Problem2 - get Employees from Manager");
    System.out.println("Problem3 - get getTotalSalary from Manager");
    System.out.println("Problem4 - get getTotalAnnualSalary from Manager");
    System.out.println("Problem5 - get getTotalAnnualBudget from Manager");
  }
}
