package Constructor;

public class Student {
String name;
int roll_no;
String address;
public void setValue(String n, int r, String a) {
	/*name=n;
	roll_no=r;
	address=a;	*/
	// OR
	this.name=n;
	this.roll_no=r;
	this.address=a;
}
public void getValue() {
	System.out.println("name is :"+name);
	System.out.println("roll no is :"+roll_no);
	System.out.println("address is :"+address);
}
}
