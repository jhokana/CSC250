import java.util.Random;


public class Dice extends Object
{
	//Fields variables owned by an instance of an object
	private int numSides;
	public Random r =new Random();
	
	public Dice(int numSides)
	{ 
		this.numSides = numSides;
		
	}
	public int roll()
	{
		return r.nextInt(this.numSides) +1;
	}
}
