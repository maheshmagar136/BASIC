package com.csi.oops;

class employee {

	private int empid;
	private String empname;
	private String empaddress;
	private long empcontact;
	private double empsalary;

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

	public long getEmpcontact() {
		return empcontact;
	}

	public void setEmpcontact(long empcontact) {
		this.empcontact = empcontact;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

}

public class EncapsulationNewConcept1 {
	public static void main(String[] args) {

		employee e1 = new employee();

		e1.setEmpid(121);
		e1.setEmpaddress("Pune");
		e1.setEmpname("Mahesh");
		e1.setEmpsalary(5505565.66);
		e1.setEmpcontact(6591645845l);

		System.out.println("\n Employee id" + e1.getEmpid());
		System.out.println("\n Employee address" + e1.getEmpaddress());
		System.out.println("\n Employee name" + e1.getEmpname());
		System.out.println("\n Employee Salary" + e1.getEmpsalary());

	}
}
