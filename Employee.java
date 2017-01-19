package exercise1;

public class Employee {
	private String Name;
	private int idNumber;
	private String department;
	private String Position;
	
	/**
	 * The setName method stores a value in the Name field
	 * @param name the value to store in Name
	 */
	//mutator setName to set the employee name
	public void setName(String name)
	{
		Name = name;
	}
	
	/**
	 * The setidNumber store a employee's ID number in the idNumber field
	 * @param id the value store in idNumber
	 */
	public void setidNumber(int id)
	{
		idNumber = id;
	}
	
	/**
	 * The setDepartment method stores a value in the Department field
	 * @param dep the value to store in Department
	 */
	public void setDepartment(String dep)
	{
		department = dep;
	}
	
	/**
	 * The setPosition method stores a value in the position field
	 * @param pos the value store in Position
	 */
	public void setPosition(String pos)
	{
		Position = pos;
	}
	
	/**
	 * The getName method returns a Employee object's Name
	 * @return the value in the Name field
	 */
	public String getName()
	{
		return Name;
	}
	
	/**
	 * The getidNumber method returns a Employee object's idNumber
	 * @return the value in the idNumber field
	 */
	public int getidNumber()
	{
		return idNumber;
	}
	
	/**
	 * The getDepartment method returns a Employee object's department
	 * @return the value in the department field
	 */
	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * The getPosition method returns a Employee object's Position
	 * @return the value in the Position field
	 */
	public String getPosition()
	{
		return Position;
	}
}
