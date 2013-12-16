package coffeShop;

public class Chocolate extends BeverageWithIngredient
{
	Beverage beverage;
	
	public Chocolate(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "and Chocolate";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .3;
	}

}
