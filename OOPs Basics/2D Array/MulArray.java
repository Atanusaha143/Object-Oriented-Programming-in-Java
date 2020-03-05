import java.util.Scanner;

public class MulArray
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter row number: ");
		int row = input.nextInt();

		System.out.print("Enter cloumn number: ");
		int col = input.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter array inputs: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = input.nextInt();
			}
		}

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}