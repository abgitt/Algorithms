import java.util.*;
import java.util.function.*;
public class CommonFunctionalities 
{
	public Consumer<int[]> displayArray = arr ->System.out.println(Arrays.toString(arr));
	// public Function<int[],String> displayArray = Arrays::toString; //working fine
	public Supplier<int[]> getArray = ()->
	{
		int[] arr = new int[7];
		int min = -50;
      	int max = 100;
      	for(int i=0;i<arr.length;i++)
      		arr[i] = (int)(Math.random() * (max - min + 1) + min);
      	return arr;
	};

	
}
