package removeDupCharacter;

public class nonVeg extends zomato {
	String mainCourse="Butter Chicken Masala";
    int price=750;
    String size="full";
    void foodPrepare() {
    	System.out.println("food is being prepared");
    }
	public static void main(String[] args) {
		nonVeg nv=new nonVeg();
		System.out.println(nv.mainCourse);
		System.out.println(nv.price);
		System.out.println(nv.size);
		System.out.println(nv.restaurant);
		System.out.println(nv.location);
		nv.foodPrepare();
		nv.foodDispatch();

	}

}
