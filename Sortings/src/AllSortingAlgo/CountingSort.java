/*
Counting sort:
	make assumptions about data(so far the algo discussed is not make any assumptions)
	used for whole numbers(not for floats or string) - only worked with non negative discrete numbers
	Don't use comparisions instead uses counts the number of occurances of each value.
	values to be sorted should be in a range
	No negative, no more than 1M num  


	Not inplace
	if we are having array size is 20 and range is 10,000 then we need to make count array as size of 10,000 whcih is rediculous
	so it is best when range is roughly equivalent to the elements in the list

	O(n) -- It is because we are making an assumption of about the data we are sorting.  

	Proc
	====
	2	5	9	8	2	8	7	10	4	3
	--> Assume we have values between 1 and 10 inclusive
	--> We have 10 possible values, so we creating a counting array of length 10 
	--> Traverse the input array from left to right.
	--> Use counting array to track how many of each values are in the input array.
	--> Use the counts in the counting array write the values in sorted order to input array. 

	* Counting sort is two phases
		counting the occurances 
		writing  back it to the array 

	2	5	9	8	2	8	7	10	4	3
	i = 0
	0	1	0	0	0	0	0	0	0	0	
	i = 1
	0	1	0	0	1	0	0	0	0	0	
	i = 2
	0	1	0	0	1	0	0	0	1	0	
	i = 3
	0	1	0	0	1	0	0	1	1	0	
	i = 4
	0	2	0	0	1	0	0	1	1	0
	i = 5
	0	2	0	0	1	0	0	2	1	0
	i = 6
	0	2	0	0	1	0	1	2	1	0	
	i = 7
	0	2	0	0	1	0	1	2	1	1
	i = 8
	0	2	0	1	1	0	1	2	1	1
	i = 9
	0	2	1	1	1	0	1	2	1	1

	Now, we need to write back to the original input array
	0	2	1	1	1	0	1	2	1	1 <----> 2	2	3	4	5	7	8	8	9	10

	Here we did not perform any comparisions based on counting only we perfomred the sorting.



*/
import java.util.*;	
public class CountingSort
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,9,8,2,8,7,10,4,3,2,11,5};
		int[] count_arr = new int[arr.length];
		int[] arr = {3,9,9,2,8,2};
		int[] count_arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			count_arr[i]=0;
		}
		for(int i=0;i<arr.length;i++)
		{
			int ind = arr[i];
			int val = count_arr[ind-1]; //this is the reason why we are taking only whole numbers.if we take any negative, float or string we can't access 
			count_arr[ind-1]=val+1;
		}
		System.out.println(Arrays.toString(count_arr));
		int[] sort = new int[arr.length];
		int ind = 0;
		for(int i=0;i<count_arr.length;i++)
		{
			if(count_arr[i]==0)
				continue;
			else
			{
				for(int j=0;j<count_arr[i];j++)
				{
					sort[ind++] = (i+1);
				}
			}
		}
		System.out.println(Arrays.toString(sort));
	}
}


/*public class Main {

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}*/