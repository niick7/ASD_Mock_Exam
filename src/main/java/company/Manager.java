package company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
  List<Employee> employeeList = new ArrayList<>();
  private double bonus;
  private double teamBudget;

  public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate) {
    super(employeeId, firstName, lastName, birthDate);
  }

  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  public void addEmployee(Employee e) {
    this.employeeList.add(e);
  }

  public void setBonus(double bonus) {
    bonus = bonus;
  }

  public void setTeamBudget(double teamBudget) {
    teamBudget = teamBudget;
  }
}
