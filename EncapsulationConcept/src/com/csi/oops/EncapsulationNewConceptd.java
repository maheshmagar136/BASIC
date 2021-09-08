package com.csi.oops;

class Employee {
	private String EmpName;

	private int EmpId;

	private double EmpSalary;

	private long EmpContactNumber;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}

	public long getEmpContactNumber() {
		return EmpContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		EmpContactNumber = empContactNumber;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpSalary=" + EmpSalary + ", EmpContactNumber="
				+ EmpContactNumber + "]";
	}

}

public class EncapsulationNewConceptd {
	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setEmpName("Swara");
		e1.setEmpContactNumber(98566545345L);
		e1.setEmpId(646544);
		e1.setEmpSalary(65465);

		System.out.println("\n EmpName:" + e1.getEmpName());
		System.out.println("\n EmpId:" + e1.getEmpId());
		System.out.println("\n EmpContact:" + e1.getEmpContactNumber());
		System.out.println("\n EmpSalary:" + e1.getEmpSalary());

	}
}
