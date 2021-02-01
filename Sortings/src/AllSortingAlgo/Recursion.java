package AllSortingAlgo;
import java.util.*;
public class Recursion
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
			System.out.println(i+"-"+factorial(i)+"-"+recFactorail(i));
	}
	public static int factorial(int num)
	{
		if(num==0)
			return 1;
		// if(num==1)
		// 	return 1;
		else
		{
			int multiplier= 1,factorial = 1;
			do
			{
				factorial*=multiplier;
				multiplier++;

				// System.out.println(multiplier+""+(factorial)+(multiplier!=num));
			}
			while(multiplier<=num);
			return factorial;
		}
	}
//Call statck n! = n * (n-1)!
	// recFactorail(0) --4 == 1   == 5
	// recFactorail(1) -- 3 == 1*1 == 6
	// recFactorail(2) -- 2 == 2*1 == 7 
	// recFactorail(3) --1 == 3*2 ==8
	public static int recFactorail(int num)
	{
		if(num==0)
			return 1;
		else
			return num * recFactorail(num-1);
	}
}