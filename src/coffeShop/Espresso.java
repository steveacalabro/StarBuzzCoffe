package coffeShop;

public class Espresso extends CoffeBeverage
{
	Beverage beverage;
	
	public Espresso(Beverage b)
	{
		beverage = b;
	}
	@Override
	public String getDescription() 
	{
		return "Espresso";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + 1;
	}

}
