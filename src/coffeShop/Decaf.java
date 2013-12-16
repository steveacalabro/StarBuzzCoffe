package coffeShop;

public class Decaf extends CoffeBeverage
{
	Beverage beverage;
	
	public Decaf(Beverage b)
	{
		beverage = b;
	}
	@Override
	public String getDescription() 
	{
		return "Decaf";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .5;
	}

}
