package company;

import java.time.LocalDate;

public class Manager extends Employee {
  private double bonus;
  private double teamBudget;

  public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate, Manager manager) {
    super(employeeId, firstName, lastName, birthDate, manager);
    this.setPosition("Manager");
  }

  public void setBonus(double bonus) {
    bonus = bonus;
  }

  public void setTeamBudget(double teamBudget) {
    teamBudget = teamBudget;
  }
}
