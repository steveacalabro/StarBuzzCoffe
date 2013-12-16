package coffeShop;

public class WhiteTea extends TeaBeverage
{
	Beverage beverage;
	
	public WhiteTea(Beverage b)
	{
		beverage = b;
	}

	@Override
	public String getDescription() 
	{
		return "White Tea";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + 1;
	}

}
