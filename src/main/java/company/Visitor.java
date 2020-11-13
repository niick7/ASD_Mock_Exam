package company;

import java.util.List;

public interface Visitor<Employee> {
  abstract List<Employee> getManagers(Employee e);
}
