/* Notes

Recursion : A function calling it self
0! = 1
(-)! is undefined 


	Not inplace
	O(nlogn) - We repeatedly dividing the algorithm
	Uses more memory
	Stable(Relative order of duplicate is preserving)

--> Divide and conquer algo
--> Recursive Algo
two major phase
	1)splitting -- logical(means no creation of new arrays)
		- start with unsorted array and divide it two parts(left array and right array)
		- Split the right and left arrays into two arrays
		- Keep splitting the arrays until their size is 1(Then they are in sorted position) 
		- inplace
	2)merging--(sorting is going to done)
		- merge every left/right pair into a sorted array
		- After the first merge,we will have the a bunch of 2-element sorted arrays
		- Then merge those sorted arrays to end up with 4-element sorted arrays 
		- Repeat the same until we get single sorted array
		- Not inplace(we use temp arrays to combine elements)

	20 35 -15 7 55 1 -22( for splitting mid value will be the end value for left array and start for right array)
	
	first split
		- start =0, end = 7(Arrlength)
		- mid = (start+end)/2 = 3
		0to2										3 to length
		20 35 -15 							(---) 7 55 1 -22

		second split 							
		- start = 0, end = 3 		       - start =3 end =7		
		- mid = (start+end)/2 =1          	-	mid = start+end/2 =5
		0to0    1to2						7 55       			1 -22
		20(---)35 15                     start =3 end =5    start = 5,end = 7
				start=1,end=3			mid 8/2 =4	          mid = 12/2 = 6
				mid=s+e/2 ==2          3 to 3 , 4 to 4       5 to 5  6 to6
				1 to 1 will left         7         55         1        -22         
				2 to 2 in right 		Sibling arrays 		Sibling arrays
				35       -15
				Sibling arrays
	We aregoing to handle entire left side of the array before starting the right side since it is the recursive nature				

merging(Sibling arrays will get merge first)
=======
20
35 -15 -- -15,35
7,55   7,55
1.-22  -22,1

merging process
==============	
	- We merge sibling right and left arrays
	- We create a temp array which is enough to hold all elements we are merging
	-	temp arr len -2
		i<- set to first element of the left array  
		j<- set to first element of the right array  
		we compare left[i] and right[j]
			if left  is smaller, we copy it to the temp array and increment i by 1
			if right is samller, we copy it to the temp array and increment j by 1 
	i<-35  j<- -15
	35<-15
		temp[ind] -15 j++
		temp[ind] -35 i++
	So temp array is sorting
	- We repet this process utill all 2-elements arrays are processed
	- At this point the temp array contains all the marged  values in sorted
	- We copy this temp array back to orignal array at the correc positions
	- if left array is x to y and right array is y+1 to z , then after copy x to z is in sorted position in final array
	- After merging each time we need to copy it back into the original array position

	35 , -15
	i = 1, j =2
	temp = -15 j++ is win
	temp = 15,35 i++
	copy back to the original array 

	20 35 -15 7 55 1 -22 <--> 20 -15 35 7 55 1 -22 
	now compare 20, -15 35
	temp - 3
	i =0, j=1
	-15 j++ 
	20 i++
	35
	copy it to back it to 0 to 3    ,--> -15 20 35 7 55 1 -22

	7 55					1 -22
	temp =2      			temp = 2
	i=3,j=4 				i=5,j=6
	temp 7 55  				temp = -22,1
	Copy back it to orifinganl   -15 20 35 7 55 -22 1


	temp =4 
	i=3 and j=5
	-22,7 
	temp = -22 j++
	7,1   = -22,1 j++
	-22,1,7,55 and copy backto the orignal arry -15 20 35 -22 1 7 55


	temp = 7
	i=0.j=3
	-15,-22
	temp = -22 j++
	-15,1 = -22,15 i++
	20,1 
	temp = -22,15,1,j++
	20,7
	temp = -22,15,1,7 j++
	20,55
	temp= -22,15,1,7,20.i++
	35,55
	temp = -22,15,1,7,20,35 i++
	final
		-22,15,1,7,20,35,55

	copy back to the orignal array back to the positions	

	*/




import java.util.*;
import java.lang.*;

public class MergeSort
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			CommonFunctionalities obj = new CommonFunctionalities();
			int[] arr = obj.getArray.get();
			// int[] arr = {20,35,-15,7,55,1,-22};
			obj.displayArray.accept(arr);

			System.out.println("Above is original");
			mergeSort(arr,0,arr.length);
			obj.displayArray.accept(arr);
		}

	}

	public static void mergeSort(int[] arr,int start,int end)
	{
					CommonFunctionalities obj = new CommonFunctionalities();

		if(end-start < 2)
			return;
		int mid = (start+end)/2;
		// for(int i=start;i<end;i++)
		// 	System.out.print(arr[i]+" ");
		// System.out.println();
		System.out.println("Splitting left array : ");
		mergeSort(arr,start,mid);
		System.out.println("Splitting rigth array : ");		
		mergeSort(arr,mid,end);	
		merge(arr,start,mid,end);
		System.out.println("Merge it : ");		
		obj.displayArray.accept(arr);

	} 

	public static void merge(int[] arr,int start,int mid, int end )
	{
		// arr[mid-1] last element in left
		// arr[mid]  first element in right	
		// for such casess no need to pass elements in temp array and again copy them into original array
		// we are suppressing that task(They are already sorted so what is the need to do) 
		if(arr[mid-1]<=arr[mid])
			return;

		int i = start;
		int j = mid;
		int ind = 0;
		int[] temp =  new int[end-start];
		//this loop will take care of checking elements between both arrays 
		// once any subarry got exhausted we need to check the remaing elements
		while(i<mid && j<end)
		{
			//			comparing left and right arrays	
			temp[ind++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
		}
		if(i<mid)
		{
			for(int k=i;k<mid;k++)
				temp[ind++] = arr[k];
		}
		/*if(j<end)
		{
			for(int k=j;k<end;k++)
				temp[ind++] = arr[k];
		}*/
		// System.arraycopy(arr,i,arr,start+ind,mid-i);
		System.arraycopy(temp,0,arr,start,ind);
	} 
}		