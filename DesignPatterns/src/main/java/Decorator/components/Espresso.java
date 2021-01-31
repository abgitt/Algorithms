package Decorator.components;

import Decorator.Beverage;

public class Espresso extends Beverage {

	@Override
	public int cost() {
		return 5;
	}

}
