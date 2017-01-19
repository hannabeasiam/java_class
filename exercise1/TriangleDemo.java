package exercise1;

public class TriangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a triangle object and assign it's address to the tri variable
		Triangle tri = new Triangle();
		
		//call the tri object's setBase method, passing 5.0
		tri.setBase(5.0);
		
		//call the tri object's setHeight method, passing 10.0
		tri.setHeight(10.0);
		
		//display triangle's base and height
		System.out.println("The triangle's base is "+ tri.getBase());
		
		System.out.println("The triangle's height is " +tri.getHeight());
		
		//display area
		System.out.println("Triangle's area is "+ tri.getArea());

	}

}
