package AllSortingAlgo;
/*

*	Quick Sort : Divide and Conquer
			Recusrive
			Uses pivot element and divide the array into 2 parts
			Elements < pivot are smaller than it and > are large ,
			Pivot will be in its correct positon but note that partitioned left and right are not necessarily in the sorted order.
			Only pivot is in its correct position

			We do the same thing for left sub array and right subarray recursively
			Eventually, every element has been pivot so every element will be in its correct sorted position+

			inplace (no temp arrays)

			Ex
			==

			20	35	-15	7	55	1	-22

			always first element as the first element in array or sub array
			start = 0, i = start
			end = 7, j = end
			pivot =20 (a[start])

			we start with --j go from right to left, looking for the first element which is less than pivot
			-22<pivot(20) , so we assign it to position i, which is 0

			j = 6

			-22	35	-15	7	55	1	-22

			now we switch to i, i++ go from left to right, looking for the first element that is greater than the pivot
			35>20, so we assign it to position j,which is 6

			i = 1

			-22	35	-15	7	55	1	35


			Here, we can observe that ther is no loss in data since we are moving the data between left to right and right to left
			Now , we check that is i and j values are crossed each other.
			if(i<j) they haven't, so we switch back to j and look for the first element that is less than pivot

			i=1,j=6

			we will check --j,which is poition at 5. 1 < pivot, so we assign it to position i.
			i=1,j=5

			-22	1 -15 7 55 1 35
			 now switch back to i, and look for the grater element from i++, which is 55(i==4)
			 55>20, so we assign in to positon j,which is 5

			 -22 1 -15 7 55 55 35

			 now tcheck for crossing i=4,and j=5


			 (j--) first element lessthan pivot 7 at pos 3, but at this time j is crossing i hense we terminate it
			 At this point ,the value of i will be the sorted postion  of the pivot value. so we assign pivot to position 4.

			 -22 1 -15 7 20 55 35 -- > if we see here piviot 20 is at correct position, all elements to less than it are small and larger
			 than it are greater to it.


			 .. We have to repeat for each subarry

			 inplace
			 o(nlogn) we reeatedly partiontiong the array into 2 halves
			 unstable algo(since we are moving the elements to left and right etc...)   

			 Note : Pivot can be any element...It is not necessary to be first element  

*/

import java.util.*;
import java.lang.*;

public class QuickSort
{
	public static void main(String[] args) 
	{
			CommonFunctionalities obj = new CommonFunctionalities();
			// int[] arr = obj.getArray.get();
			int[] arr = {20,35,-15,7,55,1,-22};
			obj.displayArray.accept(arr);

			System.out.println("Above is original");

			quickSort(arr,0,arr.length);
			obj.displayArray.accept(arr);


			/*int start = 0,end = arr.length-1;
			int i=start,j=end;
			int pivot = arr[i];

			while(i<=j)
			{
				System.out.println(i+" "+j);

				while(arr[j]>pivot)
					j--;
				arr[i]=arr[j];
				obj.displayArray.accept(arr);
				// j--;
				while(arr[i]<pivot)
					i++;
				arr[j]=arr[i];
				// i++;
				obj.displayArray.accept(arr);
			}
			arr[i]=pivot;
			obj.displayArray.accept(arr);*/
	}

	public static void quickSort(int[] arr,int start,int end)
	{
		if(end-start<2)
			return ;
		int pivotInd = partition(arr,start,end);
		quickSort(arr,start,pivotInd);
		
		quickSort(arr,pivotInd+1,end);
	}

	public static int partition(int[] arr,int start,int end )
	{
		int pivot = arr[start];
		int i=start,j=end;
		while(i<j) //if (i>j) means it is crossed
		{

			while(i<j && arr[--j]>=pivot);
			if(i<j)
				arr[i]=arr[j];
			while(i<j && arr[++i]<=pivot)
			if(i<j)
				arr[j]=arr[i];	
		}
		arr[j]=pivot;
		return j;
	}
}	



/*package academy.learnprogramming.quicksort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}*/
