//WAP to take input from the user and search for the number and find the position of that number in array  

package array;
import java.util.Scanner;
public class Array_UserInput_Number_searching 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Enter the size of array");
  	  int size=sc.nextInt();
  	  int number[]=new int[size];
  	  for(int i=0;i<size;i++)  // To take input from user
  	  {
  		  number[i]=sc.nextInt();
  	  }
   
  	  System.out.println("Enter the number which you want to find");
  	  int num=sc.nextInt();      //The number is store which the user what to find
  	  
  	  for(int i=0;i<number.length;i++)     // To print output 
  	  {
  		  System.out.println(number[i]);
  		  if(number[i]==num)
  		  {
  			  System.out.println("Number "+num+" found at index \t"+i);
  		  }
  		  else
  		  {
  			  System.out.println("Number "+num+" not found");
  		  }
  	  }
	}

}
