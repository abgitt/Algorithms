package Factory;

public class CatFactory extends ICreator {

	

	@Override
	protected IProduct createAnimal() {
		pr = new Cat();
		return pr;
	}

}
