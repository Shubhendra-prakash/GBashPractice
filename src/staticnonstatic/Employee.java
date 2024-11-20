package staticnonstatic;

public class Employee {
	// static
 static String company_Name="Shubh pvt Ltd";
 static String company_Address="Ashram Chowk New Delhi";
 
 // non-static
 String emp_name;
 int emp_id;
 int age;
  public static void giveBiometrics() {
	  System.out.println("Employee should give Biometric");
  }
  public void work() {
	  System.out.println("Employee is working");
  }
	public static void main(String[] args) {
		System.out.println(company_Name);
		System.out.println(company_Address);
		giveBiometrics();
		System.out.println("=============================");
		Employee e1= new Employee();
		e1.emp_name="shubh";
		e1.age=25;
		e1.emp_id=121;
		System.out.println(e1.emp_name);
		System.out.println(e1.emp_id);
		System.out.println(e1.age);
		e1.work();
		System.out.println("=============================");
		Employee e2= new Employee();
		e2.emp_name="amit";
		e2.age=26;
		e2.emp_id=122;
		System.out.println(e2.emp_name);
		System.out.println(e2.emp_id);
		System.out.println(e2.age);
		e2.work();
		System.out.println("=============================");
		Employee e3= new Employee();
		e3.emp_name="manish";
		e3.age=27;
		e3.emp_id=123;
		System.out.println(e3.emp_name);
		System.out.println(e3.emp_id);
		System.out.println(e3.age);
		e3.work();
	}

}
