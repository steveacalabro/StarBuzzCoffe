package coffeShop;

public class WhipCream extends BeverageWithIngredient
{
	Beverage beverage;
	
	public WhipCream(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "and WhipCream";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .3;
	}

}
