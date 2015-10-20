public class DiceRoller 

{

	private String dexpr;
	public DiceRoller(String dexpr)
	{
		this.dexpr = dexpr;
	}
	
	public void display()
	{
		System.out.println("DiceRoller: " + this.dexpr);
		
	}
}