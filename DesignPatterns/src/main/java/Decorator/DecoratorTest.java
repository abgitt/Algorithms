package Decorator;

import Decorator.components.Cappuccino;
import Decorator.components.Espresso;
import Decorator.decorators.Caramel;
import Decorator.decorators.Soya;

public class DecoratorTest {

	public static void main(String[] args) 
	{
		Beverage cap = new Cappuccino();
		Beverage esp = new Espresso();
		
		Beverage ord1 = new Caramel(new Soya(cap));
		Beverage ord2 = new Soya(esp);
		Beverage ord3 = new Caramel(new Soya(esp));
		
		System.out.print(ord1.cost()+"--");
		ord1.getDesc();
		System.out.print(ord2.cost()+"--");
		ord2.getDesc();
		System.out.print(ord3.cost()+"--");
		ord3.getDesc();
	}

}
