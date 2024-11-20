package test;

public class Driver {

	public static void main(String[] args) {
		Employee e1= new Employee("mohan", 1, 20000,"Engineer", 22);
		Employee e2= new Employee("rohan", 2, 30000,"sale", 23);
		Employee e3= new Employee("sohan", 3, 40000,"Editor", 24);
		Employee e4= new Employee("mohit", 4, 50000,"Finance", 25);
		
		Employee[] x= new Employee[4];
		
		x[0]=e1;
		x[1]=e2;
		x[2]=e3;
		x[3]=e4;
		
		for(Employee p:x) {
			p.displayEmployee();
		}

	}

}
