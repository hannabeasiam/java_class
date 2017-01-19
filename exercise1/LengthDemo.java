package exercise1;

public class LengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a rectangle object and assign its address to the box variable
		/**
		 * Declare a variable named box
		 * The data type of the variable is Rectangle, because word Rectangle is not
		 * the name of a primitive data type
		 * new = key word new creates an object in memory
		 * name of a class Rectangle() followed
		 */
		Rectangle box = new Rectangle();
		
		//Indicate what we are doing
		System.out.println("Sending the value 10.0 " + "to the setLength method.");
		
		//Call the box object's setLenth method, passing 10.0
		//as an argument
		box.setLength(10.0);
		
		//call the box object's setWidth method.
		box.setWidth(20.0);

		//Display the object's length and width
		System.out.println("The box's length is "+ box.getLength());
		
		System.out.println("the box's width is "+ box.getWidth());
		
		//Display the area
		System.out.println("The box's area is "+ box.getArea());
		
		
	}

}
