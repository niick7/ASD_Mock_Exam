package company;

import java.time.LocalDate;

public class Application {
  public static void main(String[] args) {
    System.out.println("Updating...");
    Manager ceo = new Manager("001", "CEO", "A", LocalDate.of(1982, 12, 01));

    Employee e1 = new Employee("002", "Tom", "B", LocalDate.of(1984, 10, 28));
    Employee e2 = new Employee("003", "Peter", "C", LocalDate.of(1994, 8, 8));
    Employee e3 = new Employee("004", "Joe", "D", LocalDate.of(1991, 6, 21));
    Employee e4 = new Employee("005", "Charles", "E", LocalDate.of(1996, 4, 22));
    Employee e5 = new Employee("006", "DJ", "F", LocalDate.of(1989, 3, 12));
    Employee e6 = new Employee("007", "Gratify", "G", LocalDate.of(1995, 5, 18));
    Manager m1 = new Manager("008", "Rock", "H", LocalDate.of(1988, 7, 16));;
    Manager m2 = new Manager("009", "Miller", "I", LocalDate.of(1989, 2, 15));;
    Manager m3 = new Manager("010", "Marry", "J", LocalDate.of(1987, 1, 03));;

    m1.addEmployee(e1);
    m1.addEmployee(e2);
    m2.addEmployee(e3);
    m2.addEmployee(e4);
    m2.addEmployee(e5);
    m1.addEmployee(m2);
    m3.addEmployee(e6);
    ceo.addEmployee(m1);
    ceo.addEmployee(m2);
    ceo.addEmployee(m3);
  }
}
