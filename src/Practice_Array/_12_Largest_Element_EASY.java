package Practice_Array;

import java.util.Scanner;

public class _12_Largest_Element_EASY
{
	public static void main(String[] args) 
	{
	int[] arr= {10,40,20,50,30};
	
	int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
	System.out.println("Largest Element is :"+large);
	}
}
