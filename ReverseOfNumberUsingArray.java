package array;

import java.util.Scanner;

public class ReverseOfNumberUsingArray
{
	public static void acc_arr(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size,i;
        
        //taking the size of array
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int[] shree=new int[size];
        
        System.out.println("Enter the "+size+" element of array");
        for(i=0;i<size;i++)
        {
        	shree[i]=sc.nextInt();
        }
	}

}
