package Program;

public class Driver {

	public static void main(String[] args) {
		Employ[] x= new Employ[10];
		
		Employ e1= new Employ("sohan",101,35000.1,"Engineer", 25);
		Employ e2= new Employ("mohan",102,36000.1,"sales", 26);
		Employ e3= new Employ("rohan",103,37000.1,"Editor", 27);
		Employ e4= new Employ("rohit",104,38000.1,"Engineer", 28);
		Employ e5= new Employ("mohit",105,39000.1,"sales", 29);
		Employ e6= new Employ("amir",106,40000.1,"Engineer", 24);
		Employ e7= new Employ("surya",107,41000.1,"Editor", 23);
		Employ e8= new Employ("kartik",108,42000.1,"Finance", 22);
		Employ e9= new Employ("harshit",109,43000.1,"sales", 21);
		Employ e10= new Employ("manish",110,44000.1,"Finance", 30);
		
		
		x[0]=e1;
		x[1]=e2;
		x[2]=e3;
		x[3]=e4;
		x[4]=e5;
		x[5]=e6;
		x[6]=e7;
		x[7]=e8;
		x[8]=e9;
		x[9]=e10;
		
		for(Employ p:x) {
			p.displayEmployeeDetails();
		}
		
	
		
       
	}

}
