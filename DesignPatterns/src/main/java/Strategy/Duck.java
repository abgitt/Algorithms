package Strategy;

public class Duck 
{
	private IDisplayBehaviour idb;
	private IFlyBehaviour ifb;
	private IQuackBehaviour iqb;
	public Duck(IDisplayBehaviour idb, IFlyBehaviour ifb, IQuackBehaviour iqb) 
	{
		this.idb = idb;
		this.ifb = ifb;
		this.iqb = iqb;
	}
	
	public void flyNow()
	{
		ifb.fly();
	}
	
	public void quackNow()
	{
		iqb.quack();
	}
	
	public void displayNow()
	{
		idb.display();
	}
	
}
