package test;

public class Employee {
	
	String name;
	int id;
	double salary;
	String profile;
	int age;
	
	Employee(String name, int id, double salary, String profile, int age){
		this.name= name;
		this.id= id;
		this.salary= salary;
		this.profile= profile;
		this.age= age;
	}
	public void displayEmployee() {
		System.out.println("Name is:"+ name);
		System.out.println("Id is:"+ id);
		System.out.println("Salary is:"+ salary);
		System.out.println("Age is:"+ age);
	}

}
