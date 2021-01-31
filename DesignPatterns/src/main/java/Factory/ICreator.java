package Factory;

public abstract class ICreator 
{
	protected IProduct pr;
    protected abstract IProduct createAnimal();
	public IProduct createdprod() 
	{
			return pr;
	}
}
