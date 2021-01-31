package Factory;

public class FactoryMain 
{
	public static void main(String args[])
	{
		//without Animal manager facotry
		/*ICreator creator = new DogFactory();
		IProduct product = creator.createAnimal();
		product.productInfo();
		
		
		ICreator creator1 = new CatFactory();
		IProduct product1 = creator1.createAnimal();
		product1.productInfo();*/
		
		ICreator catFact = AnimalManagerFactory.getAnimals(AnimalType.CAT);
		IProduct cat = catFact.createAnimal();
		cat.productInfo();
		
		ICreator dogFact = AnimalManagerFactory.getAnimals(AnimalType.DOG);
		IProduct dog = dogFact.createAnimal();
		dog.productInfo();
		
	}
}
