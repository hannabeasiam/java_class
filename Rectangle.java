package exercise1;

public class Rectangle {

	private double length;
	private double width;
	
	 /**
	   The setLength method stores a value in the length field
	   @param len the value to store in length
	  */
	//setLength is mutator(setter)
	//mutator method that stored a value in a field or changes the value of a field
	public void setLength(double len)
	{
		length = len;
	}
	
	/**
	  * The setLength method stores a value in the width field
	  * @param w the value to store in width
	  */
	public void setWidth(double w)
	{
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