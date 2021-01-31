package Decorator;

public abstract class AddonDecorator extends Beverage {

	public void getDesc()
	{
		System.out.println("Description in Decorator");
	}
	
	@Override
	public int cost() {
		return 0;
	}

}
