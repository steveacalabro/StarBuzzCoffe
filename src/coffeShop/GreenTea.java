package coffeShop;

public class GreenTea extends TeaBeverage
{
	Beverage beverage;
	
	public GreenTea(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "Green Tea";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + 1;
	}

}
