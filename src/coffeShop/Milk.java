package coffeShop;

public class Milk extends BeverageWithIngredient
{
	Beverage beverage;
	
	public Milk(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "and Milk";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .3;
	}

}
