import java.util.*;
public class SelectionSort
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{	
			CommonFunctionalities obj = new CommonFunctionalities();
			int[] arr = obj.getArray.get();//new int[] {21,23,12,34,2,7};
			descendingSort(arr);
			obj.displayArray.accept(arr);	
		}	
	}

	static void descendingSort(int[] arr)
	{
		
		System.out.println("performing selection sort");
		int unsortedInd = arr.length-1;
		int start = 0;
		while(start<unsortedInd)
		{
			int ind = 0;
			int i=0;
			for(;i<=unsortedInd;i++)
			{
				if(arr[ind]<arr[i])
					ind = i;
			}
			// System.out.println("index"+ind+"-"+arr[ind]);
			i--;
			int temp = arr[i];
			arr[i]=arr[ind];
			arr[ind]=temp;
			unsortedInd--;
			// obj.displayArray.accept(arr);	

		}
	}
}