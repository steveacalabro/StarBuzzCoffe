package coffeShop;

public class TeaBased implements SizeFactor
{	
	@Override
	public double SizeCost(Size size) 
	{
		double returnCost = 0;
		
		switch(size)
		{
			case Large:
				returnCost = .70;
				break;
			case Medium:
				returnCost = .50;
				break;
			case Small:
				returnCost = .20;
				break;
		}
		return returnCost;
	}
}
