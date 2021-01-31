package Strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateDuck {

	public static void main(String[] args) 
	{
		IDisplayBehaviour db = new TextDisplay();
		IFlyBehaviour fb = new JetFly();
		IQuackBehaviour qb = new NoQuack();
		Duck wildDuck = new Duck(db,fb,qb);
		wildDuck.displayNow();
		wildDuck.flyNow();
		wildDuck.quackNow();
		
		db=new GraphicDisplay();fb=new NormalFly();qb=new SimpleQuack();
		Duck cloudDuck = new Duck(db,fb,qb);
		cloudDuck.displayNow();
		cloudDuck.flyNow();
		cloudDuck.quackNow();
		
		int[] a = {12,5,787,1,23};
		
		
		List<Integer> al = Arrays.asList(12,5,787,1,23);
		List<Integer> al2 = al.stream()
							.map(i->i)
							.limit(2)
							.collect(Collectors.toList());
		
		System.out.println(al2);
		
	}

}
