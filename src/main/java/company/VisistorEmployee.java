package company;

import java.util.List;

public class VisistorEmployee implements Visitor<Employee> {
  @Override
  public List<Employee> getManagers(Employee e) {
    return e.getManagers(this);
  }
}
