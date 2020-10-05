/*
Radix Sort :
	- Make assumptions about data
	- Data must have same radix<--------->(for decimal (0-9),for binary(0 and 1) and for alphabet (a-z))
		and Same Width (same size like abcdr - 5,1234 - 4) 
	- Because of this data must be integer or string
	- Sort is based on each individual digit or letter position
	- Start at right most and come to left
	- Must be stable sort algo

	Counting sort is often used as the sort algorithm for radix sort -  must be stable counting sort algo
	O(n) can achieve this because we are making assumptions about the data 
	Even so it runs slower than o(nlogn) since overhead like digits isolation
	Stable and inplace
	inplace depends on what algorithm is used  


	4725	4586	1330	8792	1594	5729

	radix is decimal,size is 4

	Based on 1's position

	1330	8792	1594	 4725	4586	5729

	Based on 10's position

	4725	5729	1330	4586	8792	1594    - Stable algorithm 

	Based on 100's  	

	1330	4586	1594	4725	5729	8792

	Based on 1000's

	1330	1594	4586	4725	5729	8792



	Stable counting sort
	Can calculate where values should be writeen in the array.
	Counting sort for 10's positions

		1330	8792	1594	 4725	4586	5729

		0	0	2	1	0	0	0	0	1	2

	We can use the counts to figure out which range of indices in the temporary array will be occupied by each value. For example , 
	we can figure out that the two values with '2' is 10s positions will occupy indices 0 and 1 in the temp array. the value with '3'
	in the temp array will occupy 2 index. 	the value with 8 in the 10th position will occupy 10 3 index. The values with '9' in the 
	10s value will occupy 4 and 5.




*/


import java.util.*;
public class RadixSort
{
	public static void main(String[] args) 
	{
		int[] arr = {4725,4586,1330,8792,1594,5729};
		int si = 0;
		int num = arr[0];
		while(num>0)
		{
			num/=10;
			si++;
		}
		while(si>0)
		{
			radixSort(arr,si);
			si--;
		}
	}
	public static void  radixSort(int[] arr, int radix)
	{
		int[] temp = new int[arr.length];
		int[] counter = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			
		} 
	}
}