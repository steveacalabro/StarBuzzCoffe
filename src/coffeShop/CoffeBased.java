package coffeShop;

public class CoffeBased implements SizeFactor
{	
	@Override
	public double SizeCost(Size size) 
	{
		double returnCost = 0;
		
		switch(size)
		{
			case Large:
				returnCost = 1.00;
				break;
			case Medium:
				returnCost = .70;
				break;
			case Small:
				returnCost = .40;
				break;
		}
		return returnCost;
	}
}
