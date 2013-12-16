package coffeShop;

public class mainUI 
{
	public static void main(String[] args)
	{
		String bevName, size;
		Beverage drink = new Beverage();
		Size drinkSize;
		
		if(args.length < 2)
		{
			System.out.println("You did not enter the order right you must enter it in the following format");
			System.out.println("<beverage name> <size> [<ingredient 1, ingredient 2, ingredient 3>]");
		}
		else
		{
			bevName = args[0];
			size = args[1];
			
			if(size.equalsIgnoreCase("Small"))
			{
				drinkSize = Size.Small;
				drink.setSize(drinkSize);
			}
			else if(size.equalsIgnoreCase("Medium"))
			{
				drinkSize = Size.Medium;
				drink.setSize(drinkSize);
			}
			else if(size.equalsIgnoreCase("Large"))
			{
				drinkSize = Size.Large;
				drink.setSize(drinkSize);
			}
			else
			{
				System.out.println("Wrong size pick correctly");
			}
			
			if(bevName.equalsIgnoreCase("Espresso"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Espresso(drink);
			}
			else if(bevName.equalsIgnoreCase("Decaf"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Decaf(drink);
			}
			else if(bevName.equalsIgnoreCase("HouseBlend"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new HouseBlend(drink);
			}
			else if(bevName.equalsIgnoreCase("Mocha"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Espresso(drink);
				drink = new Chocolate(drink);
			}
			else if(bevName.equalsIgnoreCase("Latte"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Espresso(drink);
				drink = new Milk(drink);
			}
			else if(bevName.equalsIgnoreCase("Cappuccino"))
			{
				drink = new Espresso(drink);
				drink = new WhipCream(drink);
			}
			else if(bevName.equalsIgnoreCase("DecafMocha"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Decaf(drink);
				drink = new Chocolate(drink);
			}
			else if(bevName.equalsIgnoreCase("DecafLatte"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Decaf(drink);
				drink = new Milk(drink);
			}
			else if(bevName.equalsIgnoreCase("DecafCappuccino"))
			{
				drink.setSizeFactor(new CoffeBased());
				drink = new Decaf(drink);
				drink = new WhipCream(drink);
			}
			else if(bevName.equalsIgnoreCase("GreenTea"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new GreenTea(drink);
			}
			else if(bevName.equalsIgnoreCase("RedTea"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new RedTea(drink);
			}
			else if(bevName.equalsIgnoreCase("WhiteTea"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new WhiteTea(drink);
			}
			else if(bevName.equalsIgnoreCase("FlowerTea"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new GreenTea(drink);
				drink = new Jasmine(drink);
			}
			else if(bevName.equalsIgnoreCase("GingerTea"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new GreenTea(drink);
				drink = new Ginger(drink);
			}
			else if(bevName.equalsIgnoreCase("TeaLatte"))
			{
				drink.setSizeFactor(new TeaBased());
				drink = new RedTea(drink);
				drink = new Milk(drink);
			}
			else
			{
				System.out.println("Wrong drink");
			}
			
			
			for(int i = 2; i < args.length; i++)
			{
				String ingredient = args[i];
				
				if(ingredient.equalsIgnoreCase("Chocolate"))
				{
					drink = new Chocolate(drink);
				}
				else if(ingredient.equalsIgnoreCase("Milk"))
				{
					drink = new Milk(drink);
				}
				else if(ingredient.equalsIgnoreCase("WhipCream"))
				{
					drink = new WhipCream(drink);
				}
				else if(ingredient.equalsIgnoreCase("Jasmine"))
				{
					drink = new Jasmine(drink);
				}
				else if(ingredient.equalsIgnoreCase("Ginger"))
				{
					drink = new Ginger(drink);
				}
				else
				{
					System.out.println("Bad ingredient");
				}
			}
			System.out.println("The total cost of your order is: "+drink.cost()+"");
		}		
	}
}
