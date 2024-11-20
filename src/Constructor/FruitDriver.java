package Constructor;

public class FruitDriver {

	public static void main(String[] args) {
		
		System.out.println("This is fruit driver class");
		Fruit f1= new Fruit("mango",120,4.5);
		System.out.println(f1.getName());
		f1.setName("Apple");
		
		f1.displayFruit();
		
		
		
		
		
		
		
		
		
		
		Fruit f2= new Fruit("banana",130,5.5);
		Fruit f3= new Fruit("apple",140,6.5);
		Fruit f4=new Fruit("orange");
		Fruit f5=new Fruit("muskmelon",150);
		Fruit f6=new Fruit(23.5);
		//Fruit f7=new Fruit();
		//f7.displayFruit();
		System.out.println("=========================");
		f1.displayFruit();
		
		System.out.println("=========================");
		f2.displayFruit();
		
		System.out.println("=========================");
		f3.displayFruit();
		
		System.out.println("=========================");
		f4.displayFruit();
		
		System.out.println("=========================");
		f5.displayFruit();
		
		System.out.println("=========================");
		f6.displayFruit();
	}
}
