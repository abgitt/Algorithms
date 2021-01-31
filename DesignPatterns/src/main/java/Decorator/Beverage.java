package Decorator;

public abstract class Beverage 
{
	public void getDesc()
	{
		System.out.println("Description in Bevarge");
	}
	public abstract int cost();
}
