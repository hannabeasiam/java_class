package exercise1;

public class Triangle {
	
	private double base;
	private double height;

	/**
	 * The setBase method stores a value in the base field
	 * @param b the value to store in base
	 */
	public void setBase(double b)
	{
		base = b;
	}
	
	/**
	 * The setHeight method stores a value in the height field
	 * @param h the value to store in height
	 */
	public void setHeight(double h)
	{
		height = h;
	}
	
	/**
	 * The getBase method returns a Triangle's object's base
	 * @return the value in the base field
	 */
	public double getBase()
	{
		return base;
	}
	
	/**
	 * The getHeight method returns a Triangle's object's Height
	 * @return the value in the base field
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * The getArea method returns a Triangle's object's area
	 * @return the product of base times height divide 2
	 */
	
	public double getArea()
	{
		return base*height/2;
	}
}
