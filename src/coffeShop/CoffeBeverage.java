package coffeShop;

public abstract class CoffeBeverage extends Beverage
{
	public CoffeBeverage()
	{
		setSizeFactor(new CoffeBased());
	}
	public abstract String getDescription();
	public abstract double cost();
}
