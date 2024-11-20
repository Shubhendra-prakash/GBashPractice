package integerProgram;

public class B extends A{
	int i=200;
	int j=40;
	
	void mul() {
		System.out.println(i*j);
	}
	void div() {
		System.out.println(i/j);
	}
	public static void main(String[] args) {
		B b=new B();
		A a=new A();
		
		a.add();
		a.sub();
		b.div();
		b.mul();
	}
}
