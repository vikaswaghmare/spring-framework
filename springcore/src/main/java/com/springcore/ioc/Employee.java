package com.springcore.ioc;

public class Employee {
	private String employeeId;
	private String employeeName;
	private float employeeSalary;
	private String employeeAddress;
	private Account account;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	public Employee(String employeeId, String employeeName, float employeeSalary, String employeeAddress,
			Account account) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
		this.account = account;
	}
	
	public Employee() {
		
	}
	public void getEmployeeDetails(){
		System.out.println("Employee Details");
		System.out.println("-------------------");
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
		System.out.println("Employee Address: "+employeeAddress);
		System.out.println("Account Details");
		System.out.println("-------------------");
		System.out.println("Account Number : "+account.getAccountNo());
		System.out.println("Account Name : "+account.getAccountName());
		System.out.println("Account Type : "+account.getAccountType());
		System.out.println("Account Balance: "+account.getBalance());
		}


}
