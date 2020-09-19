
public class InsertionSort {

	public static void main(String[] args) 
	{

		CommonFunctionalities obj = new CommonFunctionalities();
		int[] arr = new int[] {21,23,12,34,2,7};
		ascendingSort(arr);
		obj.displayArray.accept(arr);	
		descendingSort(arr);
		obj.displayArray.accept(arr);	
	}
	public static void ascendingSort(int[] arr)
	{
		for(int j=1;j<arr.length;j++)
		{
			int key = arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1]=arr[i--];
			}
			arr[i+1]=key;
		}
	}
	public static void descendingSort(int[] arr)
	{
		for(int j=1;j<arr.length;j++)
		{
			int key = arr[j];
			int i=j-1;
			while(i>=0 && arr[i]<key)
			{
				arr[i+1]=arr[i--];
			}
			arr[i+1]=key;
			System.out.println();

		}
	}
		

}
