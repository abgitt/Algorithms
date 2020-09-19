import java.util.*;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {21,23,12,34,2,7};
		CommonFunctionalities obj = new CommonFunctionalities();
		descendingSort(arr);
		obj.displayArray.accept(arr);	
		// System.out.println(obj.displayArray.apply(arr));
	}
	public static void descendingSort(int[] arr)
	{ 
		System.out.println("BubbleSort");
		int unsortedInd = arr.length-1;
		int start = 0;
		while(start<=unsortedInd)
		{
			for(int i=0;i<unsortedInd;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			unsortedInd--;
		}
	}	
	
}