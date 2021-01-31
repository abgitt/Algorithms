package Factory;

public class AnimalManagerFactory 
{
	public static ICreator getAnimals(AnimalType animal)
	{
		ICreator type;
		switch(animal)
		{
			case CAT:
				type = new CatFactory();
				break;
			case DOG:
				type = new DogFactory();
				break;
			default:
				type  = null;
				break;
		}
		return type;
	}
}
