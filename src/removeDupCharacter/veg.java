package removeDupCharacter;

public class veg extends zomato {
    String mainCourse="Butter Paneer Masala";
    int price=350;
    String size="half";
    void foodPrepare() {
    	System.out.println("food is being prepared");
    }
	public static void main(String[] args) {
		veg v=new veg();
		System.out.println(v.mainCourse);
		System.out.println(v.price);
		System.out.println(v.size);
		System.out.println(v.restaurant);
		System.out.println(v.location);
		v.foodPrepare();
		v.foodDispatch();
		
		
	}

}
