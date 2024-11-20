package variableHiding;

public class CarNonStatic {
       int p=10; 
       public void demo() {
    	   System.out.println("this is demo method");
    	   int p=21;
    	   System.out.println("local p is:"+p);
    	   System.out.println("global p is:"+this.p);
       }
	public static void main(String[] args) {
		CarNonStatic c= new CarNonStatic();
		c.demo();
	}
}
