package coffeShop;

public class Ginger extends BeverageWithIngredient
{
	Beverage beverage;
	
	public Ginger(Beverage b)
	{
		beverage = b;
	}

	@Override
	public String getDescription() 
	{
		return "and Ginger";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .6;
	}
	
}
