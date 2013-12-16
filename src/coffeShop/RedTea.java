package coffeShop;

public class RedTea extends TeaBeverage
{
	Beverage beverage;

	public RedTea(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "Red Tea";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .8;
	}

}
