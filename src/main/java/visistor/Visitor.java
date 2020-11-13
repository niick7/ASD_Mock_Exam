package visistor;

import mock.Employee;

public interface Visitor {
  abstract double visit(Employee employee);
}
