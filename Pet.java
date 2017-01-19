package exercise1;

public class Pet {
	
	private String Name;
	private String Animal;
	private double Age;

	/**
	 * The setName method stores a value name in the Name field
	 * @param name the value to store in Name
	 */
	//mutator method for Name
	public void setName(String name)
	{
		Name = name;
	}
	
	/**
	 * The setAnimal method stores a value in the Animal field
	 * @param ani the value to store in Animal
	 */
	//mutator method to set Animal
	public void setAnimal(String ani)
	{
		Animal = ani;
	}
	
	/**
	 * The setAge method stores a value in the Age field
	 * @param age the value to store in Age
	 */
	//mutator method to set Age
	public void setAge(Double age)
	{
		Age = age;
	}
	
	/**
	 * The getName method returns a Pet object's name
	 * @return the value in the Name field
	 */
	//accessor (setter)for the name
	public String getName()
	{
		return Name;
	}
	
	/**
	 * The getAnimal method returns a Pet object's Animal
	 * @return the value in the Animal field
	 */
	//accessor (setter)for the Animal
	public String getAnimal()
	{
		return Animal;
	}
	
	/**
	 * The getAge method returns a Pet object's Age
	 * @return the value in the Age field
	 */
	//accessor (setter)for the Age
	public double getAge()
	{
		return Age;
	}
	

}
