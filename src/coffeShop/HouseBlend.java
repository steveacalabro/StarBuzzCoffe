package coffeShop;

public class HouseBlend extends CoffeBeverage
{
	Beverage beverage;
	
	public HouseBlend(Beverage b)
	{
		beverage = b;
	}
	@Override
	public String getDescription() 
	{
		return "HouseBlend";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .8;
	}

}
