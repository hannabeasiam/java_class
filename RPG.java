package exercise1;

public class RPG {

	private int hitPoints;
	private int magicPoints;
	
	/**
	 * The sethitPoints method stores a value in the hitPoints field
	 * @param hit the value to store in hitPoints
	 */
	//mutator setName to set the charactor's hit point
	public void HitPoints(int hit)
	{
		hitPoints = hit;
	}
	
	/**
	 * The setMagicPoints method stores a value in the magicPoints field
	 * @param magic the value to store in magicPoints
	 */
	//mutator setName to set the charactor's magic point
	public void setMagicPoints(int magic)
	{
		magicPoints = magic;
	}
	
	/**
	 * The getHitpoints method returns a RPG object's hitPoints
	 * @return the value in the hitPoints field
	 */
	public int getHitPoints()
	{
		return hitPoints;
	}
	
	/**
	 * The getMagicPoints method returns a RPG object's MagicPoints
	 * @return the value in the MagicPoints field
	 */
	public int getMagicPoints()
	{
		return magicPoints;
	}
}
