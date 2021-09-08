package com.csi.oops;

class Employee{
	private int empid;
	private String empname;
	private String empaddress;
	private String empsalary;
	private long empcontact;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}
	public long getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(long empcontact) {
		this.empcontact = empcontact;
	}
	
}
public class EncapsulationNewConcept {
public static void main(String[] args) {
	Employee e1=new Employee();
	
	e1.setEmpid(121);
	e1.setEmpname("Mahesh");
	e1.setEmpaddress("Pune");
	e1.setEmpsalary("999655.33");
	e1.setEmpcontact(986545215485l);
	
System.out.println("\n Employee id: " +e1.getEmpid());
System.out.println("\n Emplolyee Name: "+ e1.getEmpname());
System.out.println("\n Employee Address:"+ e1.getEmpaddress());
System.out.println("\n Employee Salary:" + e1.getEmpsalary());
System.out.println("\n Employee contact:" +e1.getEmpcontact());

}
}
 //// Ganesh