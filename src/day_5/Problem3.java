package day_5;

import java.util.Date;

abstract class Employee{
	
	int employeeID;
	Date joiningDate;
	
	public Employee(int empID) {
		employeeID=empID;
		joiningDate=new Date();
	}
	
	abstract void generatePaySlip();
	
}

class SalesPerson extends Employee{
	int NoOfSales;
	int basePay;
	int commissionPerSale;
	public SalesPerson(int empID, int noOfSales, int basePay, int commissionPerSale) {
		super(empID);
		NoOfSales = noOfSales;
		this.basePay = basePay;
		this.commissionPerSale = commissionPerSale;
	}
	@Override
	void generatePaySlip() {
		System.out.println("The monthly accountable pay is :"+basePay+(NoOfSales*commissionPerSale));
	}
	
}

class SalesManager extends SalesPerson{
	private SalesPerson[] agentSalesPersons;

	public SalesPerson[] getAgentSalesPersons() {
		return agentSalesPersons;
	}
	
	public int getTotalSales
	
}

class SalesTerritoryManager extends SalesManager{
	
}

class Worker extends Employee{
	private int numberOfWorkingDays;
	private int wagePerDay;
	private int overTime;
	public Worker(int empID, int numberOfWorkingDays, int wagePerDay, int overTime) {
		super(empID);
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.wagePerDay = wagePerDay;
		this.overTime = overTime;
	}
	
	public int getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}

	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		this.numberOfWorkingDays = numberOfWorkingDays;
	}

	public int getWagePerDay() {
		return wagePerDay;
	}

	public void setWagePerDay(int wagePerDay) {
		this.wagePerDay = wagePerDay;
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	@Override
	void generatePaySlip() {
		System.out.println("The monthly accountable salary is :"+numberOfWorkingDays*wagePerDay+(overTime/9*wagePerDay));
	}
}



public class Problem3 {

}
