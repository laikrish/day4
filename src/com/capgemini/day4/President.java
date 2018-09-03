package com.capgemini.day4;

public class President extends Employee{
private double tourAllowance;
private double kilometerTravelled;
public static final double telephoneAllowance=2000;
	public President() {
		super();
		// TODO Auto-generated constructor stub
	}

	public President(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}

	public President(double tourAllowance, double kilometerTravelled) {
		super();
		this.tourAllowance = tourAllowance;
		this.kilometerTravelled = kilometerTravelled;
	}
	@Override
	public double calculateNetSalary() {
		setHra(0.5*getBasicSalary());
		setPf(0.12*getBasicSalary());
		tourAllowance=8.0*kilometerTravelled;
		setGrossSalary(getHra()+getPf()+getMedical()+tourAllowance+telephoneAllowance);
		setNetSalary(getGrossSalary()-(getPf()+getPt()));
		
		return getNetSalary();
		
	}
	

}
