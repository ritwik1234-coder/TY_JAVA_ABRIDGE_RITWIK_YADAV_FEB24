package com.capgemini.assignments.arraydouble;

public class TestA {

	public static void main(String[] args) {
		Employee[] empl=new Employee[2];
		Employee e1=new Employee(101,"Ritwik");
		Employee e2=new Employee(102,"Amrit");
		empl[0]=e1;
		empl[1]=e2;
		printEmployeeDetails(empl);
		Employee emp[]=getemployees();
		printEmployeeDetails(emp);
		
	}
	private static void printEmployeeDetails(Employee[] empl) {
		for (int i = 0; i < empl.length; i++) {
			System.out.println("Id-"+empl[i].id);
			System.out.println("Name-"+empl[i].name);
			System.out.println("************************************");
		}
	}
	static Employee[] getemployees() {
		Employee[] empl= new Employee[2];
		Employee e1=new Employee(114,"Garima");
		Employee e2=new Employee(124,"Sakshi");
		empl[0]=e1;
		empl[1]=e2;
		return empl;
	}
}
