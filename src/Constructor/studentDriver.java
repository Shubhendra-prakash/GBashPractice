package Constructor;

public class studentDriver {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setValue("shubh", 24, "ashram chowk");
		
		Student s2= new Student();
		s2.setValue("surya", 25, "noida sec 52");
		
		Student s3= new Student();
		s3.setValue("amir", 26, "shaheen bagh delhi");
		
		s1.getValue();
		s2.getValue();
		s3.getValue();
	}
}
