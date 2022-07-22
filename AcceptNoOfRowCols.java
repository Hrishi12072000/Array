//WAP to accept number of rows and columns and enter the element inside the array
package array;
import java.util.Scanner;

public class AcceptNoOfRowCols 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		row=sc.nextInt();
		System.out.println("Enter the number of col:");
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the number in row and col to display:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
			    System.out.println();
			}
	}
}
