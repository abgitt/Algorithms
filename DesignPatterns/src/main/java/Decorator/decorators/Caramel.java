package Decorator.decorators;

import Decorator.Beverage;

public class Caramel extends Beverage {
	Beverage type;
	public Caramel(Beverage type)
	{
		this.type = type;
	}
	
	@Override
	public int cost() {
		return type.cost()+5;
	}

}
