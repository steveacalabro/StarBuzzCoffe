package coffeShop;

public class Jasmine extends BeverageWithIngredient
{
	Beverage beverage;
	
	public Jasmine(Beverage b)
	{
		beverage = b;
	}
	
	@Override
	public String getDescription() 
	{
		return "and Jasmine";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .5;
	}

}
