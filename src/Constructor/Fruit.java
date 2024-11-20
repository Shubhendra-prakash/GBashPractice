package Constructor;

import java.util.Scanner;

public class Fruit {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Enter key");
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		if(key.equalsIgnoreCase("password")){
		this.name = name;
		}
	}
	int price;
	double weight;
	/*Fruit(){
		
		
	}*/
	Fruit(String name){
		this.name=name;
	}
	Fruit(int price){
		this.price=price;
	}
	Fruit(double weight){
		this.weight=weight;
	}
	Fruit(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	Fruit(String name, int price, double weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	public void displayFruit() {
		System.out.println("Name is:"+ name);
		System.out.println("Price is:"+ price);
		System.out.println("Weight is:"+ weight);
	}
}
