package Program;

public class Employ {

	 String name;
	 int id;
	 double salary;
	 String profile;
	 int age;
	
	Employ(String name, int id, double salary, String profile,int age)
	{
		this.name= name;
		this.id= id;
		this.salary= salary;
		this.profile= profile;
		this.age= age;
	}
	
	  public void displayEmployeeDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: " + salary);
	        System.out.println("Work Profile: " + profile);
	        System.out.println("Age: " + age);
	       // System.out.println();
	    }
	
	
}
