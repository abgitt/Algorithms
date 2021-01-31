package Factory;

public class DogFactory extends ICreator {

	

	@Override
	protected IProduct createAnimal() {
		pr = new Dog();
		return pr;
	}
}