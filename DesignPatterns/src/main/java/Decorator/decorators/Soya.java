package Decorator.decorators;

import Decorator.Beverage;

public class Soya extends Beverage {
	Beverage type;
	public Soya(Beverage type)
	{
		this.type = type;
	}
	
	@Override
	public int cost() {
		return type.cost()+10;
	}

}
