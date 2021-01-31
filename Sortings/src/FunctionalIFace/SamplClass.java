package FunctionalIFace;

public class SamplClass 
{
	public static void main(String[] args)
	{
		SampleFunctionalInterface s = (x)-> x*x;
		System.out.println(s.calculate(4));
		s = x->x*x*x;
		System.out.println(s.calculate(4));
		System.out.println();
	}
}
