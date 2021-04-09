import java.util.Scanner;

public class NextPrime {
	
	public boolean isPrime(int num)
	{
		int temp = 0;
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{	
				temp = 1;
				break;
			}
			else
				continue;
		}
		
		if(temp == 0)
			return true;
		else
			return false;
	}
	
	public boolean isNumberAvailable(int num, int[] arr)
	{
		boolean flag = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(num == arr[i])
			{	
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void findNextPrime(int num, int[] arr, NextPrime np)
	{
		boolean state = false;
		while(true)
		{
			num = num+1;
			state = np.isPrime(num);
			if(state==true)
			{
				if(np.isNumberAvailable(num, arr))
				{
					System.out.println("Next prime is available for given number is " +num);
					break;
				}
				else
				{
					System.out.println("No prime is available for given number in the array " );
					break;
				}		
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {3, 0, 2, 5, 4,7,9};
		
		NextPrime np = new NextPrime();
		System.out.println("Enter number to find next prime :");
		np.findNextPrime(sc.nextInt(), arr, np);
	}
}
