package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee
        extends Employee {

  public static final double STANDARD_DEDUCTION = 10_000.0;

  // properties/fields
  private double rate;
  private double hours;

  // constructors
  public HourlyEmployee() {
    super();
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate); // delegate to superclass ctor, which handles name and hireDate
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate); // delegate to neighboring ctor, which handles name and hireDate
    setRate(rate); // handle these myself, by delegating to their setters
    setHours(hours);
  }

  // business methods
  @Override
  public void pay() {
    System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
  }

  @Override
  public void payTaxes() {
    double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
    System.out.printf("%s paid hourly taxes for %s\n", getName(), taxes);
  }

  @Override
  public double getStandardDeduction() {
    return STANDARD_DEDUCTION;
  }

  // accessor methods
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  // toString
  @Override
  public String toString() {
    return super.toString() + String.format(", rate=%.2f, hours=%s", getRate(), getHours());
  }
}