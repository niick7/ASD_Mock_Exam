package company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
  private double bonus;
  private double teamBudget;
  private List<Employee> employees = new ArrayList<>();

  public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate) {
    super(employeeId, firstName, lastName, birthDate);
    this.setPosition("Manager");
  }

  public void setBonus(double bonus) {
    bonus = bonus;
  }

  public void setTeamBudget(double teamBudget) {
    teamBudget = teamBudget;
  }

  public void addEmployee(Employee e) {
    employees.add(e);
    e.setManager(this);
  }

  public List<Employee> getEmployees() {
    return this.employees;
  }

  public List<Employee> getAllEmployeeByManager() {
    List<Employee> employees = new ArrayList<>();
    for(Employee e : this.getEmployees()) {
      employees.add(e);
      if (e instanceof Manager) {
        employees.addAll(((Manager) e).getAllEmployeeByManager());
      }
    }
    return employees;
  }
}
