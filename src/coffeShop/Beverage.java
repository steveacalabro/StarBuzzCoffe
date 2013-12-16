package coffeShop;

public class Beverage 
{
	private String description;
	private SizeFactor sizeCost;
	private Size size;
	
	//const
	public Beverage()
	{
	}
	
	//getter
	public String getDescription()
	{
		return description;
	}
	public SizeFactor getSizeFactor()
	{
		return sizeCost;
	}
	public Size getSize()
	{
		return size;
	}
	
	//setter
	public void setDescription(String d)
	{
		description = d;
	}
	public void setSizeFactor(SizeFactor s)
	{
		sizeCost = s;
	}
	public void setSize(Size s)
	{
		size = s;
	}

	//method
	public double cost()
	{
		return sizeCost.SizeCost(size);
	}
}
