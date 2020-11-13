package visistor;

import company.Employee;

public interface Visitor {
  abstract double visit(Employee employee);
}
