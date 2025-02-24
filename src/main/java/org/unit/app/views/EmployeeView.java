package org.unit.app.views;

import org.unit.app.models.EmployeeModel;

public class EmployeeView {

  public static void displaySalaryDetails(EmployeeModel employee) {
    System.out.println(employee.getFirstName() + " " + employee.getLastName() + ": R$ " + employee.getAnnualSalary());
  }

  public static void displayEmployees() {
    EmployeeModel employee1 = new EmployeeModel("Carlos", "Silva", 3000.00);
    EmployeeModel employee2 = new EmployeeModel("Ana", "Souza", 4000.00);

    System.out.println("Salários anuais antes do aumento:");
    displaySalaryDetails(employee1);
    displaySalaryDetails(employee2);

    employee1.applyRaise();
    employee2.applyRaise();

    System.out.println("\nSalários anuais após o aumento de 10%:");
    displaySalaryDetails(employee1);
    displaySalaryDetails(employee2);
  }

}
