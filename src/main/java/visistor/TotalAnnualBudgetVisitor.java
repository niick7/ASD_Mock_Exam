package visistor;

import mock.Employee;
import mock.Manager;

import java.util.List;

public class TotalAnnualBudgetVisitor implements Visitor {
  @Override
  public double visit(Employee employee) {
    double total = 0;
    if (employee instanceof Manager){
      total += employee.getTotalAnnualBudget();
      List<Employee> employees = ((Manager) employee).getAllEmployeeByManager();
      for(Employee e: employees) {
        total += e.getTotalAnnualBudget();
      }
    }

    return total;
  }
}
