package com.capgemini.day4;

public class SalesManager extends Employee {
	public double petrolallowance;
	public double foodallowance;
	public double otherallowance;

//public double managerSalary;
public SalesManager() {
	super();
	// TODO Auto-generated constructor stub
}
public SalesManager(int employeeId, String employeeName, double basicSalary, double medical) {
	super(employeeId, employeeName, basicSalary, medical);
	// TODO Auto-generated constructor stub
}




@Override
public double calculateNetSalary() {
	setHra(0.5*getBasicSalary());
	setPf(0.12*getBasicSalary());
	petrolallowance=0.8*getBasicSalary();
	foodallowance=0.13*getBasicSalary();
	otherallowance=0.3*getBasicSalary();
	setGrossSalary(getHra() + getBasicSalary() + getMedical()+petrolallowance+foodallowance+otherallowance);
	setNetSalary(getGrossSalary() - (getPf() + getPt()));
	return getNetSalary();
}
}
