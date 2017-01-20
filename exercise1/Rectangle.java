package exercise1;

public class Rectangle {

	private double length;
	private double width;
	
	public static void main(String[] args)
	{
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle();
		//R1
		R1.setLength(4);
		R1.setWidth(5);
		//R2
		R2.setLength(3);
		R2.setWidth(11);
		//First Rectangle R1
		System.out.println("length is "+R1.getLength());
		System.out.println("width is "+R1.getWidth());	
		System.out.println("Area is "+R1.getArea());
		//Second Rectangle R2
		System.out.println("length is "+R2.getLength());
		System.out.println("width is "+R2.getWidth());	
		System.out.println("Area is "+R2.getArea());
	}
	 /**
	   The setLength method stores a value in the length field
	   @param len the value to store in length
	  */
	//setLength is mutator(setter)-change value
	//mutator method that stored a value in a field or changes the value of a field
	public void setLength(double len)
	{
		length = len;
	}
	
	/**
	  * The setLength method stores a value in the width field
	  * @param w the value to store in width
	  */
	//public void setField(fieldType val){fieldVariable=val;}
	public void setWidth(double w)
	{
		//validate mutator, with mutator we can controll value
		if(wi>=0)
			width = w;
	}
	
	/**
	 * The getLength method returns a Rectangle object's length
	 * setLength store length as private data, so to execute to outside of object..
	 * @return the vale in the length field 
	 */
	//getLength is accessor method(getter)
	//accessor method that gets a value from a class's field but does not change it
	public double getLength()
	{
		return length;
	}
	
	/**
	 * the getWidth method returns a Rectangle object's width
	 * @return the value in the width field
	 * */
	//Accessors Templete public fieldType getField(){return fieldVarible;}
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * The getArea method returns a Rectangle object's area
	 * @return the product of length times width
	 */
	
	public double getArea()
	{
		return length*width;
	}
	
}
