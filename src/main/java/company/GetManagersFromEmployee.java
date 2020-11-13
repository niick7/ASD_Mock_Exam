package company;

import java.util.ArrayList;
import java.util.List;

public class GetManagersFromEmployee {
  Employee employee;
  List<Manager> managers = new ArrayList<>();

  public GetManagersFromEmployee(Employee employee) {
    this.employee = employee;
  }

  public List<Manager> getManagers() {
    Manager manager = employee.getManager();
    while(manager != null) {
      managers.add(manager);
      manager = manager.getManager();
    }

    return managers;
  }
}
