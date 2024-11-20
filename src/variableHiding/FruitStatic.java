package variableHiding;

public class FruitStatic {
static int x=40;
public static void test() {
	System.out.println("this is test method");
	int x=50;
	System.out.println("local x is:"+x);
	System.out.println("global x is:"+FruitStatic.x);
}
	public static void main(String[] args) {
		test();
	}
}
