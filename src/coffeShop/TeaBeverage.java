package coffeShop;

public abstract class TeaBeverage extends Beverage
{
	public TeaBeverage()
	{
		setSizeFactor(new TeaBased());
	}
	public abstract String getDescription();
	public abstract double cost();
}
