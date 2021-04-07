
public class MinMaxArray {

	
	public void findMinMax(int[] arr)
	{
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] <= min)
				min = arr[i];
			else if(arr[i] >= max)
				max = arr[i];
				
		}
		System.out.println(min + " " + max);
	}
	public static void main(String[] args) {
		int arr[] = {3, 0, 2, 5, 4,7,9};
		MinMaxArray mma = new MinMaxArray();
		mma.findMinMax(arr);
		
	}

}
