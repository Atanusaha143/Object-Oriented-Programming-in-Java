import java.util.Scanner;

public class TaskSumMinMax
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter Array Size: ");
		int n = input.nextInt();
		int arr[] = new int[n]; 

		System.out.print("Enter "+n+" numbers: ");
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; 
		for(int i=0; i<n; i++)
		{
			arr[i] = input.nextInt();

			sum += arr[i];

			if(arr[i]<min) min = arr[i];

			if(arr[i]>max) max = arr[i];  
		}

		System.out.println("Sum of the Array is: "+sum);
		System.out.println("Minimum number of the Array is: "+min);
		System.out.println("Maximum number of the Array is: "+max);
	}
}