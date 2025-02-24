package org.unit.app.models;

public class EmployeeModel {

  private String firstName;
  private String lastName;
  private double monthlySalary;

  public EmployeeModel(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    setMonthlySalary(monthlySalary);
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

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
  }

  public double getAnnualSalary() {
    return Math.round(monthlySalary * 12 * 100.0) / 100.0;
  }

  public void applyRaise() {
    this.monthlySalary *= 1.10;
  }

}
