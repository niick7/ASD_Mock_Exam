package visistor;

import company.Employee;
import company.Manager;

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
