package company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String employeeId;

  private String firstName;
  private String lastName;

  private LocalDate birthDate;
  private LocalDate startDate;

  private Double salary;
  private String position;

  private Manager manager;

  public Employee(String employeeId, String firstName, String lastName, LocalDate birthDate, Manager manager) {
    super();
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;

    // Default Values
    this.startDate = LocalDate.now();
    this.salary = 4500.0;
    this.position = "Employee";
    this.manager = manager;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Manager getManager() { return manager; }

  public List<Manager> getManagers() {
    List<Manager> managers = new ArrayList<>();
    Manager manager = this.getManager();
    while(manager != null) {
      managers.add(manager);
      manager = manager.getManager();
    }

    return managers;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "employeeId='" + employeeId + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", birthDate=" + birthDate +
      ", startDate=" + startDate +
      ", salary=" + salary +
      ", position='" + position + '\'' +
//      ", manager=" + manager +
      '}';
  }
}

